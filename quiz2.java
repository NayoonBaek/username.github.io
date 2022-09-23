public class quiz2 {
    public static void main(String[] args) {
///2. 다음 코드를 실행했을 때 출력 결과는 무엇입니까? (증감연산자에 대해 알아보세요!)
        int x=10;
        int y=20;
        int z = (++x) + (y--);
        System.out.println(z);
    }
}
//증감연산자는 자기 자신의 값을 증가시키거나 감소시키는 연산자(++, —)
//이 증감연산자를 변수앞에 놓는냐, 변수뒤에 놓느냐에 따라 차이가 있다.
//변수 앞에 존재할 경우 식에 쓰이기 전에 원래 변수의 원래값+1,원래값-1
//변수 뒤에 존재할 경우 식에 쓰인 뒤 변수의 원래값+1, 원래값-1 된다

// a=(++x)
//x=x+1=11
//a=x=11

//b=(y--)
//b=y=20
//y=y-1=19

//따라서 z = (++x) + (y--) = a+b = 11 + 20 = 31 이고,
// x=11, y=19이다.