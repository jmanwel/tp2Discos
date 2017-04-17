package ar.edu.unlam.PB2;

public class Disco {
	private Double radioInterior;
	private Double radioExterior;
	private Double area;
	private Double areaInterior;
	private Double areaExterior;
	private Double perimetroInterior;
	private Double perimetroExterior;
	
	public Disco(Double radioInterior, Double radioExterior){
		this.radioInterior=radioInterior;
		this.radioExterior=radioExterior;
	}
	
	public Double getArea(){
		if (radioInterior>0){
			areaInterior=Math.PI*(radioInterior*radioInterior);
		}
		if (radioExterior>0){
			areaExterior=Math.PI*(radioExterior*radioExterior);
		}
		return area=areaExterior-areaInterior;
	}
	
	public Double getPerimetroInterior(){
		if (radioInterior>0){
			perimetroInterior=Math.PI*2*radioInterior;
		}
		return perimetroInterior;
	}
	
   public Double getPerimetroExterior(){
	if (radioExterior>0){
		perimetroExterior=Math.PI*2*radioExterior;
	}
	return perimetroExterior;
	}
   
   public void setRadioInterior(Double radioInterior){
	   this.radioInterior=radioInterior;
   }
   public void setRadioExterior(Double radioExterior){
	   this.radioExterior=radioExterior;
   }
   public String getRadioInterior(){
	   return "El radio interior es "+radioInterior;
   }
   public String getRadioExterior(){
	return "El radio interior es "+radioExterior;
   }
}
