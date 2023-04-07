package assignment_3;

public class Assignment2_2 {

	public static void main(String[] args) {
		
        int[][] a = {{1, 0, 2}, {-1, 3, 1}}; 			// 	  2x3 ���
        												// [  1  0  2  ]
        												// [ -1  3  1  ]
        
        int[][] b = {{3, 1}, {2, 1}, {1, 0}}; 			//   3x2 ���
        												// [  3  1  ]
        												// [  2  1  ]
        												// [  1  0  ]
        
        int[][] c = new int[a.length][b[0].length]; 	// ��� C ���� = ��� A and ��� B�� ���� ���� 
        												// ��� C�� 0�� 2x2 ��� �ʱ�ȭ
        

        // ��ø �ݺ��� - ����� �� 
        // �ܺ� �ݺ��� 2�� - ��� C�� ��� ���� �ݺ�
        // ���� �ݺ��� 1�� - ��� A�� �ش� �� and ��� B�� �� ���� ���
        
        for (int i = 0; i < a.length; i++)			// �ܺ� �ݺ��� 
        {
            for (int j = 0; j < b[0].length; j++)	// 2x2 ��� C�� ��, �� �ݺ�
            {
                for (int k = 0; k < b.length; k++)	// ���� �ݺ��� - ��� A�� i+1��° ��� ��� B�� j+1��° ���� ���� ���
                {
                    c[i][j] += a[i][k] * b[k][j];
                }
            }
        }
        
        //��� ����
        //		  			  2x3 ���		      3x2 ���
		// 				[  (1)  (2)  (3)  ]	  [  <1>  <4>  ]
		// 				[  (4)  (5)  (6)  ]   [  <2>  <5>  ]
        //						 			  [  <3>  <6>  ]
      
        // 						      <��� ����>
        // [  (1)x<1> + (2)x<2> + (3)x<3>	(1)x<4> + (2)x<5> + (3)x<6>  ]
        // [  (4)x<1> + (5)x<2> + (6)x<3>	(4)x<4> + (5)x<5> + (6)x<6>  ]
        
        
        
        // ��� ���
        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < c[0].length; j++) {
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }


	}

}