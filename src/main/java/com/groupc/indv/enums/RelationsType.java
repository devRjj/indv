package com.groupc.indv.enums;

public enum RelationsType {
	
	Father("K01"),
	Husband("K02"),
	Mother("K03"),
	Son("K04"),
	Daughter("K05"),
	Wife("K06"),
	Brother("K07"),
	MotherInLaw("K08"),
	FatherInLaw("K09"),
	DaughterInLaw("K010"),
	SisterInLaw("K011"),
	SonInLaw("K012"),
	BrotherInLaw("K013"),
	Other("K015");
	
	/*
	 * K01- Father
K02-Husband
K03- Mother
K04- Son
K05- Daughter
K06- Wife
K07- Brother
K08- Mother-In
law
K09-Father-In-law
K10- Daughter-In- law
K11- Sister-In-Law
K12- Son-In-law
K13- Brother-In- law
K15- Other*/
	
	private final String relationCode;
	
	private RelationsType(String relationCode) {
		this.relationCode = relationCode;
	}

}
