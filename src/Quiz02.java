public class Quiz02 {

    public static void main(String args[]) {
        int x=10;
        int y=20;
        int z = (++x) + (y--);
        System.out.println(z);

//        ++x = 10을 먼저 +1 증가시킨 후(11) 사용
//        y-- = 20을 먼저 사용한 후 1 감소(19)
//         int z = (++x) + (y--);
//         -> int z = 11 + 20
//         -> 31
//
//         증감연산자
//         ++x : x를 먼저 +1 증가시킨 후 그 값을 사용
//         --x : x를 먼저 -1 감소시킨 후 그 값을 사용
//         x++ : x값을 먼저 사용한 후 1 증가
//         x-- : x값을 먼저 사용한 후 1 감소

    }
}