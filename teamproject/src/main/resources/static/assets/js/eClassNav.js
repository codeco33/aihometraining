jQuery(document).ready(function($){
	
	$('#sectionTitleBtn').click(function(){
		$('#sectionName').clone().appendTo('#sectionTitle');
	});
	
	$('.curriculumAdd').click(function(){
		$('#sectionCurriculumBox').clone().appendTo('#sectionCurriculum');
	});
	
	$('.questionAdd').click(function(){
		$('#questionName').clone().appendTo('#questionTitle');
	});
	
	$('.introduce').click(function(){
		$('.introduceBox').css('display','none');
		$('.sectionTitleBox').css('display','block');
	});
	
	$('.sectionTitle').click(function(){
		$('.sectionTitleBox').css('display','none');
		$('.curriculumBox').css('display','block');
	});
	
	$('.curriculum').click(function(){
		$('.curriculumBox').css('display','none');
		$('.questionBox').css('display','block');
	});
	
	$('.question').click(function(){
		$('.questionBox').css('display','none');
		$('.answerBox').css('display','block');
	});
	
	$('.answer').click(function(){
		$('.answerBox').css('display','none');
		$('.applyBox').css('display','block');
	});
			//운동 계획 카테고리 대-중 분류
		  $(document).on('change',"#eClassCategoryLargeCode", function(e) {
			  console.log("이거 되나?medium");
            var eClassCategoryLargeCode = $('select[name="eClassCategoryLargeCode"]').val();
            console.log(eClassCategoryLargeCode);
                $.ajax({
                    url : '/CategoryLarge',
                    type : 'post',
                    data : {
                        'eClassCategoryLargeCode' : eClassCategoryLargeCode
                    },
                    dataType : 'json',
                    success : function(data) {
                        console.log(JSON.stringify(data));
                        console.log(data.length);
                        var txt1='<option value="none">운동 카테고리 중분류 선택하세요</option>';
                            for(var i =0;i<data.length;i++)
                            {
                          	  txt1 +='<option value="'+data[i].eClassCategoryMediumCode+'" '    +'>' + data[i].eClassCategoryMediumName  +"</option>";
                            }
                            console.log(txt1);
                            $('#eClassCategoryMediumCode').empty();
                            $('#eClassCategoryMediumCode').append(txt1);
                            $('#eClassCategoryMediumCode').niceSelect('update');
                            
                            
                        }
                });
            });
		  
		  //운동 계획 카테고리 중-소 분류
		  $(document).on('change',"#eClassCategoryMediumCode", function(e) {
			  console.log("이거 되나?small");
            var eClassCategoryMediumCode = $('select[name="eClassCategoryMediumCode"]').val();
            console.log(eClassCategoryMediumCode);
                $.ajax({
                    url : '/CategoryMedium',
                    type : 'post',
                    data : {
                        'eClassCategoryMediumCode' : eClassCategoryMediumCode
                    },
                    dataType : 'json',
                    success : function(data) {
                        console.log(JSON.stringify(data));
                        console.log(data.length);
                        var txt1='<option value="none">운동 카테고리 소분류 선택하세요</option>';
                            for(var i =0;i<data.length;i++)
                            {
                          	  txt1 +='<option value="'+data[i].eClassCategorySmallCode+'" '    +' data-cate="'+ data[i].eClassCategorySmallName +'">' + data[i].eClassCategorySmallName  +"</option>";
                            }
                            console.log(txt1);
                            $('#eClassCategorySmallCode').empty();
                            $('#eClassCategorySmallCode').append(txt1);
                            $('#eClassCategorySmallCode').niceSelect('update');
                            
                            
                        }
                });
		  });
});