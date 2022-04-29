<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ page session="true"%>
<!DOCTYPE html>
<html>
<%@ include file="../include/head.jsp"%>
<%@ include file="../include/plugin_js.jsp"%>
<script>
/* 	$(function(){
		//주문 상세조회
		$(".btn-outline-dark").click(function(){
			location.href="../";
		});
		//발주확인
		$(".btn-outline-success").click(function(){
			location.href="admin/check/order?orderCode=" + ${order.orderCode};
		});
		//주문취소 처리
		$(".btn-outline-dangery").click(function(){
			location.href = "replyupdate?reno=" + $
			{boardreply.reno};
		});
	}) */
   $(document).ready(function(){
      console.log("ajax test");
      
      function do_ajax(elem, mydata, filename)
      {
          $.ajax({
              url: filename,
              context: elem,
              data: mydata,
              datatype: "html",
              success: function (data, textStatus, xhr) {
                  elem.innerHTML = data;
              }
          });
      }

      // 댓글 저장버튼 클릭 이벤트 (댓글 등록)
      $('.btn-outline-success').click(function( orderCode, orderCheck){
    	 console.log("주문확인");
   
    	 
    	
    	 var url = "${pageContext.request.contextPath}/admin/check/order";
    	 var paramData = {
    	         "orderCode": orderCode,
    			 "orderState" : orderCheck
    	                  
    	      };
    	 $.ajax ({
    		 url : url,
    		 data : paramData,
    		 dataType : 'json',
    		 type : 'POST',
    		 cache : false,
    	        processData: false,
    		 success : function(result){
    			 console.log("결과" + result);
    			 
    			 
    		 },
    		 error : function(data){
    			 alert("에러가 발생했습니다.");
    		 }
    	 });
      });
      
  
      
   });
	function fn_updateReply(reno, rewriter){
      var editmemo = $('#editmemo').val();
      var url = "${pageContext.request.contextPath}/board/modifyReply2"; //ajax수정
      var paramData = {
            "reno" : reno,
            "rewriter" : rewriter,
            "rememo" : editmemo
      }; // 수정데이터
      $.ajax({
         url : url,
         data : paramData,
         dataType : 'json',
         type : 'POST',
         success : function(result){
        	 console.log(result.queryDataList); 
        	 let tempList = result.queryDataList;

        	 for (let i in tempList) {
        	 	console.log("댓글수정 결과 : ", result[i][Object]);
        
        	 }
            console.log("댓글수정 결과:"+result);
            replylist(); //댓글목록 호출
         },
         error : function(data){
            console.log(data);
            alert("에러가 발생했습니다.");
         }
      });
   }
	
	
	</script>
<body id="page-top">
	<!-- Page Wrapper -->
	<div id="wrapper">
		<!-- Sidebar -->
		<%@ include file="../include/sidebar.jsp"%>

		<!-- Content Wrapper -->
		<div id="content-wrapper" class="d-flex flex-column">

			<!-- Main Content -->
			<div id="content">
				<!-- Topbar -->
				<%@ include file="../include/topbar.jsp"%>

				<!-- Begin Page Content -->
				<div class="container-fluid">


					<!-- Page Heading -->


					<!-- DataTales -->
					<div class="colmb-4 mb-4">
						<div class="card border-left-success shadow h-100 py-2">
							<div class="card-body">
								<div class="row no-gutters align-items-center">
									<div class="col mr-2">
										<h6 class="m-0 font-weight-bold text-success mb-4">주문관리
											&gt; 주문조회</h6>
										<form name="search"
											action="<c:url value='/admin/list/order' />" method="post"
											class="form-horizontal">
											<input type="hidden" name="page"
												value="${pageMaker.cri.page}"> <input type="hidden"
												name="perPageNum" value="${pageMaker.cri.perPageNum}">
											<!-- 주문상태 -->
											<div class="row align-items-start">
												<div class="col-auto">
													<div class="input-group form-group">
														<select class="form-control" id="id_condition"
															name="condition">
															<option selected>상세조회 전체</option>
															<option value="order_orderCode"
																${pageMaker.cri.condition == 'order_orderCode' ? 'selected' : ''}>주문번호</option>
															<option value="order_orderName"
																${pageMaker.cri.condition == 'order_orderName' ? 'selected' : ''}>구매자명</option>
														</select> <input type="text" name="keyword"
															class="form-control search-input"
															value="${pageMaker.cri.keyword}">
													</div>
												</div>
												<div class="col-auto ">
													<div class="input-group form-group">

														<button type="submit" class="btn btn-success search-btn">
															<i class="fa fa-search"></i> &nbsp;&nbsp;검 색
														</button>
													</div>
												</div>
											</div>

											<div class="form float-right mb-4">
												<div class="col form-inline">
													<h3>
														<span class="badge badge-pill badge-success">총
															${pageMaker.totalCount} 건</span>
													</h3>
													<div class="col">
														<div class="form-group">
															<div class="item select-form">
																<select id="id_perPageNum" name="perPageNum"
																	class="form-control input-sm">
																	<option selected>row</option>
																	<option value="5"
																		${pageMaker.cri.page== perPageNum ? selected : 5}>5개</option>
																	<option value="10"
																		${pageMaker.cri.page== perPageNum ? selected : 10}>10
																		개</option>
																	<option value="20"
																		${pageMaker.cri.page== perPageNum ? selected : 20}>20
																		개</option>
																</select>
															</div>
														</div>
													</div>

												</div>
											</div>
										</form>

									</div>

								</div>
								<div class="table-responsive">
									<table class="table table-hover">
										<thead>
											<tr>
												<th class="text-center" scope="col">주문번호</th>
												<th class="text-center" scope="col">주문상태</th>
												<th class="text-center" scope="col">구매자명</th>
												<th class="text-center" scope="col">주문상품</th>
												<th class="text-center" scope="col">상품금액</th>
												<th class="text-center" scope="col">결제금액</th>
												<th class="text-center" scope="col">결제일시</th>
												<th class="text-center" scope="col">주문확인처리</th>
												<th class="text-center" scope="col">주문취소</th>
											</tr>
										</thead>
										<tbody>
											<c:forEach var="order" items="${list}">
												<tr>
													<td class="text-center"><a class="text-success "
														href="<c:url value='/admin/order?orderCode=${order.orderCode}&orderId=${order.orderId}'/>"
														id="orderCode">${order.orderCode}</a></td>
													<td class="text-center">${order.orderState}</td>
													<td class="text-center">${order.orderName}</td>
													<td class="text-center">${order.productName}</td>
													<td class="text-center">${order.amountTotal}원</td>
													<td class="text-center">${order.payPrice}원</td>
													<td class="text-center">${order.payDate}</td>
													<td class="text-center">
														<button type="button" class="btn btn-outline-success"
															data-toggle="modal" data-target="#orderChekc"
															data-whatever="${order.orderCode}">주문확인</button>
													</td>


													<td class="text-center"><button type="button" data-id="${order.orderCode}"
															class="btn btn-outline-danger" data-toggle="modal"
															data-target="#orderCansel"
															data-whatever="">주문취소</button></td>
													<td><input type="hidden" id="orderId"
														value="${order}"></td>
												</tr>
											</c:forEach>
										</tbody>
									</table>
									<!-- page nav -->
									<%@ include file="../include/pagenav_js.jsp"%>

								</div>
							</div>
						</div>
					</div>
					<!-- DataTales end-->

					<!-- end Page Content -->
				</div>
				<!-- /.container-fluid -->
			</div>
			<!-- End of Main Content -->

			<!-- Footer -->
			<%@ include file="../include/footer.jsp"%>
			<!-- End of Footer -->

		</div>
		<!-- End of Content Wrapper -->

	</div>
	<!-- End of Page Wrapper -->

	<!-- Scroll to Top Button-->
	<%@ include file="../include/scrollTop_button.jsp"%>
	
	<div class="modal fade" id="orderCansel" tabindex="-1"
		aria-labelledby="exampleModalLabel" aria-hidden="true">
		<div class="modal-dialog">
			<div class="modal-content">
				<div class="modal-header">
					<h5 class="modal-title" id="exampleModalLabel">New message</h5>
					<button type="button" class="close" data-dismiss="modal"
						aria-label="Close">
						<span aria-hidden="true">&times;</span>
					</button>
				</div>
				<div class="modal-body">
					<form name="cancel" action="<c:url value='/admin/cancel'/>" method="post"class="form-horizontal">
						<div class="form-group">
							<label for="recipient-name" class="col-form-label">주문번호</label>
							<input type="text" class="form-control" id="recipient-name"  name="orderCode" readonly="readonly">
						</div>
						<div class="form-group">
							<div class="item select-form">
								<select id="cancelContent" name="cancelContent"
									class="form-control input-sm">
									<option value="1"
										${order.cancelContent== cancelContent ? selected : 1}>단순변심</option>
									<option value="2"
										${order.cancelContent== cancelContent ? selected : 2}>상품품절
										</option>
									<option value="3"
										${order.cancelContente== cancelContent ? selected : 3}>파손불량
										</option>
								</select>
							</div>
							<label for="message-text" class="col-form-label">취소처리하시겠습니까?</label>
						</div>
						<button type="submit" class="btn btn-success cancel-btn">
															<i class="fa fa-search"></i> &nbsp;&nbsp;취소처리
														</button>
						<input type="hidden" name="orderCode" class="form-control search-input"  value="${order.orderCode}">
						<input type="hidden" name="payPrice" class="form-control search-input" value="${payPrice}">
					</form>
				</div>
				<div class="modal-footer">
					<button type="button" class="btn btn-secondary"
						data-dismiss="modal">Close</button>
						
				
				</div>
			</div>
		</div>
	</div>
	

</body>
<script>
$(function(){
//주문 상세조회
$(".btn-outline-dark").click(function(){
	location.href="../";
});
//발주확인
$(".btn-outline-success").click(function(){
	location.href="admin/check/order?orderCode=" + ${order.orderCode};
});
//주문취소 처리
$(".btn-outline-dangery").click(function(){
	location.href = "replyupdate?reno=" + $
	{boardreply.reno};
});
}) 
$('#orderCansel').on('show.bs.modal', function (event) {
	  var button = $(event.relatedTarget) // Button that triggered the modal
	  var recipient = button.data('whatever') // Extract info from data-* attributes
	  // If necessary, you could initiate an AJAX request here (and then do the updating in a callback).
	  // Update the modal's content. We'll use jQuery here, but you could use a data binding library or other methods instead.
	  var modal = $(this)
	  modal.find('.modal-title').text('주문취소')
	  modal.find('.modal-body input').val(recipient)
	})
</script>






</html>
