package assignment_3;

public class Assignment2_2 {

	public static void main(String[] args) {
		
        int[][] a = {{1, 0, 2}, {-1, 3, 1}}; 			// 	  2x3 행렬
        												// [  1  0  2  ]
        												// [ -1  3  1  ]
        
        int[][] b = {{3, 1}, {2, 1}, {1, 0}}; 			//   3x2 행렬
        												// [  3  1  ]
        												// [  2  1  ]
        												// [  1  0  ]
        
        int[][] c = new int[a.length][b[0].length]; 	// 행렬 C 생성 = 행렬 A and 행렬 B의 곱을 저장 
        												// 행렬 C는 0의 2x2 행렬 초기화
        

        // 중첩 반복문 - 행렬의 곱 
        // 외부 반복문 2개 - 행렬 C의 행과 열을 반복
        // 내부 반복문 1게 - 행렬 A의 해당 행 and 행렬 B의 열 내적 계산
        
        for (int i = 0; i < a.length; i++)			// 외부 반복문 
        {
            for (int j = 0; j < b[0].length; j++)	// 2x2 행렬 C의 행, 열 반복
            {
                for (int k = 0; k < b.length; k++)	// 내부 반복문 - 행렬 A의 i+1번째 행과 행렬 B의 j+1번째 열의 내적 계산
                {
                    c[i][j] += a[i][k] * b[k][j];
                }
            }
        }
        
        //행렬 계산법
        //		  			  2x3 행렬		      3x2 행렬
		// 				[  (1)  (2)  (3)  ]	  [  <1>  <4>  ]
		// 				[  (4)  (5)  (6)  ]   [  <2>  <5>  ]
        //						 			  [  <3>  <6>  ]
      
        // 						      <행렬 계산법>
        // [  (1)x<1> + (2)x<2> + (3)x<3>	(1)x<4> + (2)x<5> + (3)x<6>  ]
        // [  (4)x<1> + (5)x<2> + (6)x<3>	(4)x<4> + (5)x<5> + (6)x<6>  ]
        
        
        
        // 결과 출력
        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < c[0].length; j++) {
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }


	}

}
