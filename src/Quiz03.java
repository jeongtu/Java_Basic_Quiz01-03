public class Quiz03 {

    public static void main(String args[]) {
        System.out.println("시작!");

        while(true) {
            int n1 = (int) (Math.random() * 6) + 1;
            int n2 = (int) (Math.random() * 6) + 1;
            System.out.println(" (" + n1 + ", " + n2 + ") ");
            if ((n1 + n2) == 5) {
                break;
            }
        }
        System.out.println("끝");
    }
}

//Math.random() 함수 = 0.xxx ~ 0.9xxx값 반환,
//랜덤함수 사용은 정수형 난수를 구할때 사용(기본형 Double형), int(정수화) 필요
//랜덤함수 0부터 시작, +1 -> 1~X 값 출력
//주사위의 숫자 1~6, 총 6개 값 필요, *6 +1