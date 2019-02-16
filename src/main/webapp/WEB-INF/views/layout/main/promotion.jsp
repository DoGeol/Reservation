<%--
  Created by IntelliJ IDEA.
  User: pdg
  Date: 2019-02-13
  Time: 10:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<body>
    <div class="section_visual">
        <div class="group_visual">
            <div class="container_visual">
                <div class="prev_e" style="display:none;">
                    <div class="prev_inn">
                        <a href="#" class="btn_pre_e" title="이전"> <i class="spr_book_event spr_event_pre">이전</i> </a>
                    </div>
                </div>
                <div class="nxt_e" style="display:none;">
                    <div class="nxt_inn">
                        <a href="#" class="btn_nxt_e" title="다음"> <i class="spr_book_event spr_event_nxt">다음</i> </a>
                    </div>
                </div>
                <div>
                    <div class="container_visual">
                        <!-- 슬라이딩기능: 이미지 (type = 'th')를 순차적으로 노출 -->
                        <ul class="visual_img">
                            <c:forEach items="${promoItem}" var="promoItem">
                                <li class="item" style="background-image: url(http://localhost:8080/resources/img/${promoItem.img_file_name});">
                                    <a href="#"> <span class="img_btm_border"></span> <span class="img_right_border"></span> <span class="img_bg_gra"></span>
                                        <div class="event_txt">
                                            <h4 class="event_txt_tit">${promoItem.title}</h4>
                                            <p class="event_txt_adr">${promoItem.address}</p>
                                            <p class="event_txt_dsc">${promoItem.event}</p>
                                        </div>
                                    </a>
                                </li>
                            </c:forEach>
                        </ul>
                    </div>
                    <span class="nxt_fix" style="display:none;"></span>
                </div>
            </div>
        </div>
    </div>
    <script type="rv-template" id="promotionItem">
        <li class="item" style="background-image: url(http://211.249.62.123/productImages/${productId}/${productImageId});">
            <a href="#"> <span class="img_btm_border"></span> <span class="img_right_border"></span> <span class="img_bg_gra"></span>
                <div class="event_txt">
                    <h4 class="event_txt_tit"></h4>
                    <p class="event_txt_adr"></p>
                    <p class="event_txt_dsc"></p>
                </div>
            </a>
        </li>
    </script>
</body>
</html>
