public class HeyJude {
	public static void main(String[] args) {
		String HEY_JUDE=new String("Hey Jude ");		//Declaración de variables
		String DONT=new String("don't ");
		String MAKE_BAD=new String("make it bad");
		String AFRAID=new String("be afraid");
		String LET_ME_DOWN=new String("let me down");
		String SAD_SONG=new String("take a sad song and make it better");
		String WERE_MADE=new String("you were made to go out and get her");
		String FOUND_HER=new String("you have found her, now go and get her");
		String REMEMBER=new String("remember to");
		String INTO_HEART=new String(" let her into your heart");
		String UNDER_SKIN=new String(" let her under your skin");
		String THEN=new String("then you ");
		String CAN=new String("can start ");
		String BEGIN=new String("begin ");
		String MAKE_BET=new String("to make it better");
		String BETTER_WA=new String ("better better better better better, oh");
		String NA=new String ("na ");
		String prueba=new String();
		int p=0;
		int nas=0;
		
	while (p<7){
		p++;
		if (p==1 || p==2 || p==4 || p==6){ //if 1, donde empiezan con hey jude
			System.out.println();
			System.out.print(HEY_JUDE);
			System.out.print(DONT);
				if (p==2||p==4){
						if (p==2){
							System.out.println(AFRAID);
						}else {
							System.out.println(LET_ME_DOWN);
						}
				}else {
					System.out.println(MAKE_BAD);
				}
				if (p==2||p==4){
					if (p==2){
						System.out.println(WERE_MADE);
					}else {
						System.out.println(FOUND_HER);
					}
				}else {
					System.out.println(SAD_SONG);
				}
			System.out.print(REMEMBER);
				if (p==1||p==4){
					System.out.println(INTO_HEART);
				}else{
					System.out.println(UNDER_SKIN);
				}
			System.out.print(THEN);
				if(p==1||p==4){
					System.out.print(CAN);
				}else {
					System.out.print(BEGIN);
				}
			System.out.println(MAKE_BET);
				if (p==6){
					System.out.println(BETTER_WA);
				}
		}else{
			System.out.println();
			while (nas<10){
				prueba=prueba+NA;
				nas++;
			}
				System.out.print(prueba); //viene de if 1, si no empiezan con hey jude, empiezan con na
					if (p==7){
						System.out.print(HEY_JUDE);
					}
		System.out.println();
	}
}
}
}
