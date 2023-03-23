package assignment_2;

public class Assignment2_1 {

	public static void main(String[] args) {
		
		int sec = 100000;		// 100000초 
        int min = sec / 60;		// 초 	=  분	X 	60	->	분	= 	초	/  60	
        int hour = min / 60;	// 분	=  시간 	X 	60	->	시간 	= 	분	/  60
        int day = hour / 24;	// 시간	=  일	X	24	->	일	=	시간	/  24	
        int year = day / 365;	// 일	=  년	X  365	->  년	=	일	/  365
        
        int reSec = sec % 60;	// 남은 초 	= 초		/ 	60의  나머지
        int reMin = min % 60;	// 남은 분 	= 분 	/ 	60의  나머지
        int reHour = hour % 24;	// 남은 시간	= 시간 	/ 	24의  나머지
        int reDay = day % 365;	// 남은 일	= 일		/	365의 나머지
        
        System.out.printf("%d초는 %d일 %d시간 %d분 %d초입니다.\n", sec, reDay, reHour, reMin, reSec);
        // %d - 형식지정자를 하용하면 출력문 printf사용
        // 형식지정자를 사용해 남은 일, 시간, 분, 초를 차례대로 출력한다.
        
        if (year > 1) 											// 만약 year가 1을 넘으면 즉, 1년을 넘으면 
        {
            System.out.printf("%d초는 1년을 넘었습니다.\n", sec);		// 100000초는 1년을 넘었습니다. 출력
        } 
        
        else if(year == 1)										// 만약 year가 1이면 즉 1,년이면
        {
        	System.out.printf("%d초는 정확히 1년입니다.\n", sec);		// 100000초는 정화히 1년입니다. 출력
        }
        else 													// 만약 둘다 아니면 -> year가 1을 넘으면 즉, 1년 미만이면
        {
            System.out.printf("%d초는 1년 미만입니다.\n", sec);		// 100000초는 1년 미만입니다. 출력
        }
        

	}

}
