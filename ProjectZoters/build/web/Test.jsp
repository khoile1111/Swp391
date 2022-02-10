<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <link href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" rel="stylesheet">
    <link rel="stylesheet" href="test.css">
    <meta charset="UTF-8">z
    <body>
        <% int count = 0;%>
        <c:forEach items="${CLIST}">
            <% count = count + 1;%>
        </c:forEach>
        <div class="count">
            <%=count%> Total comment
        </div>
        <c:forEach items="${CLIST}" var="c">
            <% int countdup = 0;%>
            <div class="container mt-5">
                <div class="container mt-5">
                    <div class="d-flex justify-content-center row">
                        <div class="col-md-8">
                            <div class="d-flex flex-column comment-section">
                                <div class="bg-white p-2">
                                    <c:forEach items="${MEMBERLIST}" var="m">
                                        <c:if test="${c.memId == m.memId}">
                                            <% countdup = countdup + 1;%>
                                            <% request.getSession().setAttribute("COUNT", countdup); %>
                                            <c:if test = "${COUNT < 2}"> 
                                            <div class="d-flex flex-row user-info"><img class="rounded-circle" src="${m.avatar}" width="40">
                                                <div class="d-flex flex-column justify-content-start ml-2"><span class="d-block font-weight-bold name">${m.nickname}</span></div>
                                            </div>
                                            </c:if>
                                        </c:if>
                                    </c:forEach>
                                    <div class="mt-2">
                                        <p class="comment-text">${c.comContent}</p>
                                    </div>
                                </div>
                                    <%-- check seession xem member dang dang nhap co duoc xoa ko --%>
                                <div class="bg-white">
                                    <div class="d-flex flex-row fs-12">
                                        <a href="deletecomment?comId=${c.comId}">Delete</a>
                                    </div>
                                </div>
                                    
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </c:forEach>
        <form action ="submit">
            <div class="container mt-5">
                <div class="d-flex justify-content-center row">
                    <div class="col-md-8">
                        <div class="d-flex flex-column comment-section">
                            <div class="bg-white p-2">
                                <div class="bg-light p-2">
                                    <%-- lay mem id --%>
                                    <input type="hidden" name="" value="" />
                                    <%-- lay movie id --%>
                                    <input type="hidden" name="mId" value="" />
                                    <%-- lay link avatar cua member theo mem Id --%>
                                    <div class="d-flex flex-row align-items-start"><img class="rounded-circle" src="https://i.imgur.com/RpzrMR2.jpg" width="40"><textarea class="form-control ml-1 shadow-none textarea" name="txtComment"></textarea></div>
                                    <div class="mt-2 text-right"><button class="btn btn-primary btn-sm shadow-none" type="submit">Post comment</button>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </form>
    </body>
</html>
