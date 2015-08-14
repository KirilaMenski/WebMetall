function hideDiv(id) {
	$('#calculate').hide();
}
function showDiv(id) {
	$('#calculate' + id).show();

}

/* Demo hide/show block */
$(document).ready(function() {

	$(".price").append("<div></div>");

	$(".price").hover(function() {
		$(this).find("div").stop(true, true).animate({
			opacity : "show"
		}, "slow");
		/* var hoverText = $(this).attr("title"); */
		$(this).find("div").text(hoverText);
	}, function() {
		$(this).find("div").stop(true, true).animate({
			opacity : "hide"
		}, "fast");
	});

});