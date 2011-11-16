<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Welcome to Bapas & RupBasan</title>
    </head>
    
    <body>
        <h3>Klien</h3>
        <ul>
            <li><a href="http://javan.web.id/demo/bapas/grid.html">DOJO</a></li>
            <li><a href="http://javan.web.id/demo/bapas/BapasMobile.apk">Android</a></li>
        </ul>
        <h3>Daftar API</h3>
        <ul>
            <li><a href="${pageContext.request.contextPath}/api/list.htm">List</a></li>
            <li><a href="${pageContext.request.contextPath}/api/doAdd.htm">Add</a></li>
            <li><a href="${pageContext.request.contextPath}/api/doSave.htm">Update</a></li>
            <li><a href="${pageContext.request.contextPath}/api/delete.htm">Delete</a></li>
        </ul>
    </body>
</html>
