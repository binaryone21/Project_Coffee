<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initail-scale=1, shrink-to-fit=no">
    <title>Dolphin Coffee</title>
    <link rel="stylesheet" href="/css/layout/header.css">
    <link rel="stylesheet" href="/css/layout/footer.css">
    <%--<script src="/js/sample/sample.js" defer></script>--%>
</head>
<body>
    <tiles:insertAttribute name="header"/>
    <tiles:insertAttribute name="main"/>
    <tiles:insertAttribute name="footer"/>
</body>
</html>
