package ci.kossovo.ecole.aspect;



public aspect MetierAspect {
	pointcut test() :execution(public static void main(String[]));

	before() :test() {
		
		System.out.println("-------------ASPECT--------------");
		System.out.println("-----------------message avant----------");
	}
	after() :test() {

		System.out.println("-------------ASPECT--------------");
		System.out.println("-----------------message apres----------");
	}
}
