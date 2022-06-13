<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!-- page nav -->
<nav class="justify-content-center justify-content-md-end">
	<ul class="pagination justify-content-center" id="pagination">
		<c:if test="${pageMaker.prev}">
			<li class="page-item"><a class="page-link text-secondary" href="#" data-page="${pageMaker.getStartPage()-1}">
				<i class="bi bi-caret-left-fill">Prev</i></a></li>
		</c:if>

		<c:forEach var="i" begin="${pageMaker.getStartPage()}" end="${pageMaker.getEndPage()}">
			<li class="${pageMaker.cri.page == i ? 'age-item active' : ''}" page-item>
			<a class="page-link text-secondary" href="#" data-page="${i}">${i}</a></li>
		</c:forEach>
		
		<c:if test="${pageMaker.next}">
			<li class="page-item"><a class="page-link  text-secondary" href="#" data-page="${pageMaker.getEndPage()+1}">
			<i class="bi bi-caret-right-fill">Next</i></a></li>
		</c:if>
	</ul>
</nav>

<script type="text/javascript">
	// 변수 정의
	$form = $("form[name='search']");
	$page = $form.find("input[name='page']");

	// 각 이벤트 등록
	// 페이지 링크 클릭
	$('ul.pagination li a[data-page]').click(function(e) {
		e.preventDefault(); // 이벤트 전파 방지,  <a>의 기본 클릭이벤트를 막기위함
		// data-page에 있는 값을 input태그 중 이름이 page인 것의 값으로 바꾸고 서브밋
		$page.val($(this).data('page'));
		$form.submit();
	}); // ul.pagination li a[data-page]

	$form.find("button[type=submit]").click(function(e) {
		e.preventDefault();
		$page.val(1);
		$form.submit();
	});

	// 목록 갯수 변경
	// id_perPageNum 변경되었을 때
	// 페이지 1, 목록수 = 현재값 으로 변경 후 서브밋
	$('#id_perPageNum').change(function(e) {
		$page.val(1);
		$form.find("input[name='perPageNum']").val($(this).val());
		$form.submit();
	}); // '#id_perPageNum'.change
	
	// 정렬 순서변경
	$('#id_seq').change(function(e) {
		$page.val(1);
		$form.find("input[name='seq']").val($(this).val());
		$form.submit();
	}); // '#id_perPageNum'.change

</script>
