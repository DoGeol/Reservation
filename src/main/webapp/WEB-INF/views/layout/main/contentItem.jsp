<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: pdg
  Date: 2019-02-13
  Time: 10:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<body>
    <div class="section_event_tab">
        <ul class="event_tab_lst tab_lst_min">
            <li class="item" data-category="0">
                <a class="anchor active"> <span>전체리스트</span> </a>
            </li>
            <li class="item" data-category="1">
                <a class="anchor"> <span>전시</span> </a>
            </li>
            <li class="item" data-category="2">
                <a class="anchor"> <span>뮤지컬</span> </a>
            </li>
            <li class="item" data-category="3">
                <a class="anchor"> <span>콘서트</span> </a>
            </li>
            <li class="item" data-category="4">
                <a class="anchor"> <span>클래식</span> </a>
            </li>
            <li class="item" data-category="5">
                <a class="anchor"> <span>연극</span> </a>
            </li>
            <li class="item" data-category="7">
                <a class="anchor"> <span>클래스</span> </a>
            </li>
            <li class="item" data-category="8">
                <a class="anchor"> <span>체험</span> </a>
            </li>
            <li class="item" data-category="9">
                <a class="anchor last"> <span>키즈</span> </a>
            </li>
        </ul>
    </div>
    <div class="section_event_lst">
        <p class="event_lst_txt">바로 예매 가능한 행사가 <span class="pink">${eventItem.size()}개</span> 있습니다</p>
        <div class="wrap_event_box">
            <!-- [D] lst_event_box 가 2컬럼으로 좌우로 나뉨, 더보기를 클릭할때마다 좌우 ul에 li가 추가됨 -->
            <ul class="lst_event_box">
                <c:forEach items="${eventItem}" var="eventItem" varStatus="status">
                    <c:if test="${status.index % 2 == 0}">
                    <li class="item">
                        <a href="detail?id=${eventItem.id}" class="item_book">
                            <div class="item_preview">
                                <img alt="${eventItem.title}" class="img_thumb" src="http://localhost:8080/resources/img/${eventItem.img_file_name}">
                                <span class="img_border"></span>
                            </div>
                            <div class="event_txt">
                                <h4 class="event_txt_tit"> <span>${eventItem.title}</span> <small class="sm">${eventItem.address}</small> </h4>
                                <p class="event_txt_dsc">${eventItem.content}</p>
                            </div>
                        </a>
                    </li>
                    </c:if>
            </c:forEach>
            </ul>
            <ul class="lst_event_box">
                <c:forEach items="${eventItem}" var="eventItem" varStatus="status">
                    <c:if test="${status.index % 2 == 1}">
                    <li class="item">
                        <a href="detail?id=${eventItem.id}" class="item_book">
                            <div class="item_preview">
                                <img alt="${eventItem.title}" class="img_thumb" src="http://localhost:8080/resources/img/${eventItem.img_file_name}">
                                <span class="img_border"></span>
                            </div>
                            <div class="event_txt">
                                <h4 class="event_txt_tit"> <span>${eventItem.title}</span> <small class="sm">${eventItem.address}</small> </h4>
                                <p class="event_txt_dsc">${eventItem.content}</p>
                            </div>
                        </a>
                    </li>
                    </c:if>
                </c:forEach>
            </ul>
            <!-- 더보기 -->
            <div class="more">
                <button class="btn"><span>더보기</span></button>
            </div>
        </div>
    </div>
</body>
</html>
