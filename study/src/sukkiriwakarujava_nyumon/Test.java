package sukkiriwakarujava_nyumon;

public class Test {
	public static void main(String [] args) {
		int pllusTotall = 0;
		int minusTotall = 0;
		int number[] = {1,2,3,4,5};
		for (int score: number ) {
			//numberをscoreへ代入して中身を表示する
			System.out.println(score);
			//配列内tで足し算するループ
			pllusTotall +=score;
			minusTotall -=score;
		}
		//拡張for文で計算したtotallを表示する
		System.out.println(pllusTotall);
		System.out.println(minusTotall);
				
		
	}

}
