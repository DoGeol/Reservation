(function (win,doc,$) {
    'use strict';
    var banner  = {
        init : function () {
            this.setElement();
            this.initLayout();
            this.bindEvent();
        },
        setElement : function () {
            this.container = $('.event');
            this.visualSection = this.container.find('.section_visual');
            this.visualGroup = this.visualSection.find('.group_visual');
            this.visualContainer = this.visualGroup.find('.container_visual');

            this.prevBtn = this.visualContainer.find('.prev_e');
            this.nextBtn = this.visualContainer.find('.nxt_e');

            this.visualCarousel = this.visualContainer.find('.container_visual_carousel');
            this.visualImgWrap = this.visualCarousel.find('.visual_img');
            this.visualItem = this.visualImgWrap.find('.item');

            this.itemIndex = 0;
            this.test = 0;
        },
        initLayout : function () {
            this.visualItem.css("width","100%");
            this.visualImgWrap.css('-webkit-transform','translate3d(0px,0,0)');
            this.setItemIndex();
            if (this.visualItem.length > 0 ){
                this.prevBtn.show();
                this.nextBtn.show();
            }

        },
        setItemIndex : function () {
            for (var i = 0, max=this.visualItem.length; i<max; i++){
                this.visualItem.eq(i).data('item-index',i);
            }
        },
        bindEvent : function () {
            this.prevBtn.on('click', $.proxy(this.onclickBtn, this));
            this.nextBtn.on('click', $.proxy(this.onclickBtn, this));
        },
        onclickBtn : function (e) {
            var target = $(e.currentTarget),
                btnState = e.currentTarget.className;
            if(btnState == 'prev_e' && this.test != 0){
                this.test += 414;
                this.visualImgWrap.css('transform', 'translate3d(' + this.test + 'px,0,0');

            }else if (btnState == 'nxt_e' && this.test <= 0) {
                this.test -= 414;
                this.visualImgWrap.css('transform', 'translate3d(' + this.test + 'px,0,0');
            }

        }
    };

    var eventContent = {
        init : function () {
            this.setElements();
            this.initLayout();
            this.bindEvents();
        },
        setElements : function () {
            this.container = $('.event');
            this.eventTab = this.container.find('.section_event_tab');
            this.eventListWrap = this.eventTab.find('.event_tab_lst');
            this.eventListItem = this.eventListWrap.find('li.item');
            this.eventListItemAnchor = this.eventListItem.find('.anchor');

            this.eventContentList = this.container.find('.section_event_lst');

            this.eventItemLengthArea = this.eventContentList.find('.event_lst_txt > .pink');
            this.eventContentBoxWrap = this.eventContentList.find('.wrap_event_box');
            this.eventContentBox = this.eventContentBoxWrap.find('.lst_event_box');

            this.moreBtn = this.eventContentBoxWrap.find('.more > .btn');

        },
        initLayout : function () {
            // category 갯수 ajax로 확인하여 뿌려줘야됌
            this.categoryLength = 5;
            this.layoutItemLength = 2;

            this.setEventTabLayout(this.categoryLength);
            this.setEventContentLayout(this.layoutItemLength);
        },
        setEventTabLayout : function (categoryLength) {
            for (var i=this.categoryLength+1, max=this.eventListItem.length; i<max; i++){
                this.eventListItem.eq(i).css('display','none');
            }
        },
        setEventContentLayout : function (layoutItemLength) {
            // 망함 로직 변경 필요 ㅠㅠㅠㅠㅠㅠㅠㅠ 일단 하드코딩
            for (var i = 0, iMax = this.eventContentBox.length; i<iMax; i++){
                var itemLength = this.eventContentBox.eq(i).find('li.item').length;
                for (var j = layoutItemLength, jMax = itemLength; j<jMax; j++){
                    this.eventContentBox.eq(i).find('li.item').eq(j).css('display','none');
                }
            }
        },
        bindEvents : function () {
            this.moreBtn.on('click', $.proxy(this.onClickMoreBtn, this));
            $(doc).on('click', '.event_tab_lst > li.item', $.proxy(this.onClickCategoryBtn, this));
        },
        onClickMoreBtn : function () {
            var legnth = this.layoutItemLength;
            legnth += 2;
            this.showItems(legnth);
        },
        showItems : function (itemLength) {
            for (var i = 0, iMax = this.eventContentBox.length; i<iMax; i++){
                for (var j = this.layoutItemLength, jMax = itemLength; j<jMax; j++){
                    this.eventContentBox.eq(i).find('li.item').eq(j).css('display','block');
                }
            }
            this.layoutItemLength = itemLength;
        },
        onClickCategoryBtn : function (e) {
            var target = $(e.currentTarget),
                categoryInfo = target.data('category');

            this.eventListItemAnchor.removeClass('active');
            target.find('.anchor').addClass('active');

            $.ajax({
                context: this,
                url : "/api/categories",
                method : "GET",
                data : { 'id' : categoryInfo },
                success : function (data) {
                    var htmlTemplate = doc.querySelector('#itemList').innerHTML;
                    this.eventContentBox.html('');
                    this.eventItemLengthArea.text(data.length+'개');

                    var resultArray = new Array();

                    for (var i=0, iMax=data.length; i<iMax; i++){
                        var resultHtml = '';

                        resultHtml += htmlTemplate.replace("{title}", data[i].title)
                            .replace("{title}", data[i].title)
                            .replace("{content}", data[i].content)
                            .replace("{address}", data[i].address)
                            .replace("{img_file_name}", data[i].img_file_name);

                        resultArray[i] = resultHtml;
                    }

                    for (var j=0, jMax=this.eventContentBox.length; j<jMax; j++){
                        for (var k=0, kMax=resultArray.length; k<kMax; k++){
                            if((j == 0) && (k%2 == 0)){
                                this.eventContentBox.eq(j).append(resultArray[k]);
                            }else if ((j == 1) && (k%2 == 1)){
                                this.eventContentBox.eq(j).append(resultArray[k])
                            }
                        }
                    }

                    this.initLayout();
                }
            });
        }

    };

    banner.init();
    eventContent.init();

}(window,window.document,window.jQuery));