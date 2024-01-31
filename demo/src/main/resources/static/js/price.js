$(document).ready(() => {
	$(".price").each(function(idx) {
		if($(this).text() >= 10) {
			$(this).parent().css("color", "red");
		}
	})
})