jQuery(document).ready(function($){
	
	$('#sectionTitleBtn').click(function(){
		$('#sectionTitle').clone().appendTo('.section');
	});
	
	$('.curriculumAdd').click(function(){
		$('.sectionCurriculum').clone(true).appendTo('#sectionTitle');
	});
	
	$('#next').click(function(){
		
	});
});