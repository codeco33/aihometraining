package aihometraining.team.dto;

public class DietMealLevelList {

	private String nutrientsAPIFoodSort;
	private String nutrientsAPISortdetail;
	
	public String getNutrientsAPIFoodSort() {
		return nutrientsAPIFoodSort;
	}
	public void setNutrientsAPIFoodSort(String nutrientsAPIFoodSort) {
		this.nutrientsAPIFoodSort = nutrientsAPIFoodSort;
	}
	public String getNutrientsAPISortdetail() {
		return nutrientsAPISortdetail;
	}
	public void setNutrientsAPISortdetail(String nutrientsAPISortdetail) {
		this.nutrientsAPISortdetail = nutrientsAPISortdetail;
	}
	
	@Override
	public String toString() {
		return "DietMealLevelList [nutrientsAPIFoodSort=" + nutrientsAPIFoodSort + ", nutrientsAPISortdetail="
				+ nutrientsAPISortdetail + "]";
	}
	
	

}
