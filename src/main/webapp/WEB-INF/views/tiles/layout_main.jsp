<%@ page contentType="text/html;charset=UTF-8" language="java" %><%
%><%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %><%
%><!DOCTYPE html>
<html lang="ko">

<head>
    <meta charset="utf-8">
    <meta name="description" content="네이버 예약, 네이버 예약이 연동된 곳 어디서나 바로 예약하고, 네이버 예약 홈(나의예약)에서 모두 관리할 수 있습니다.">
    <meta name="viewport" content="width=device-width,initial-scale=1,maximum-scale=1,minimum-scale=1,user-scalable=no">
    <title>네이버 예약</title>
    <link rel="stylesheet" href="/resources/css/style.css">
</head>

<body>
    <!-- body 태그 내부의 header 를 담당하는 부분이다. -->
    <tiles:insertAttribute name="header" />

    <hr>
    <!-- 아래 div가 컨트롤러에 의해 교체되는 content 영역이다. -->

    <div class="event">
        <tiles:insertAttribute name="promotion"/>
        <tiles:insertAttribute name="content_item"/>
    </div>

    <!-- body 태그 내부의 footer 를 담당하는 부분이다. -->
    <tiles:insertAttribute name="footer" />

    <script type="rv-template" id="itemList">
        <li class="item">
            <a href="detail?id={id}" class="item_book">
                <div class="item_preview">
                    <img alt="{title}" class="img_thumb" src="http://localhost:8080/resources/img/{img_file_name}">
                    <span class="img_border"></span>
                </div>
                <div class="event_txt">
                    <h4 class="event_txt_tit"> <span>{title}</span> <small class="sm">{address}</small> </h4>
                    <p class="event_txt_dsc">{content}</p>
                </div>
            </a>
        </li>
    </script>
<script src="//code.jquery.com/jquery.min.js"></script>
<script src="/resources/js/main/main.js"></script>
</body>

</html>

