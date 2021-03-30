<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/include/taglib2.jsp" %>
<!DOCTYPE html>
<html>
<head>
<%@ include file="/WEB-INF/views/include/head.jsp" %>
<title>게시물 보기</title>

</head>
<body>
<%@ include file="/WEB-INF/views/include/teamNavigation.jsp" %>
<div class="container">
   <h2 class="name">공지사항</h2>
   <div class="row" style="margin-right:0; margin-left:0;">
      <table class="table">
         <thead>
          <tr class="table-active" style="color:#939597">
               <th scope="col" style="width:60%">
               
				 *게시판 이용규정*<br>
                  &nbsp작성자 : 운영진
         
               </th>
               <th scope="col" style="width:40%" class="text-right">
                   작성일: 2021.03.02<br>
                   19:28:24
               </th>
            </tr>
             <tr>
            <td colspan="5"></td>
        </tr>
         </thead>
         <tbody>
         <tr>
               <td>
            * 게시물 삭제 <br>
- 아래 게시물 삭제 조건에 해당하는 경우 통보없이 삭제되며, 경우에 따라 활동 정지 또는 강퇴 될 수 있습니다.<br>
<br>
 1) 게시판 성격에 맞지 않는 글<br>
 - 각 게시판의 주제와 성격에 맞지 않게 게시되는 글은 통보 없이 삭제됩니다.<br>
<br>
 2) 광고글 
 - 광고글은 엄격하게 금지됩니다. 운영진의 판단에 따라 통보 없이 삭제됩니다.<br>
 다음 항목들은 모두 광고로 간주됩니다.<br>
  - 타사이트 가입 유도<br>
  - 오픈 톡방 홍보 및 가입 유도<br>
  - 수다글을 빙자한 개인 블로그/유튜브/카페 등으로의 유입 중대를 목적으로 하는 링크 등록<br>
<br>
 3) 중복글 / 도배글<br>
 - 불필요한 중복글은 최초 한 개의 글만을 제외하고 모두 삭제됩니다.<br>
 - 끌어올림이 필요한 경우에는 기존 글을 삭제하여 중복 글 없도록 해주시기 바랍니다.<br>
<br>
 4) 그 외 운영진이 필요하다고 판단하는 경우<br>
 - 신고가 들어온 게시글, 사이트에 적합하지 않은 게시글이라 판단되는 경우 해당 게시글은 무통보 삭제됩니다.
               </td>
            </tr>
            
         </tbody>
             <tfoot>
      <tr>
            <td colspan="5"></td>
        </tr>
      </tfoot>
      </table>
   </div>
   <!-- btn-group은 색상 -->
   <div class="btn-group">
   <div class="col-sm-12">
   <button type="button" id="btnList" class="btn btn-secondary" onclick="location.href='/board/list'">리스트</button>
   </div>
</div>
   
   
  
</body>
</html>