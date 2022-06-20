package coplit;

public class NumberSearch {
    public static void main(String[] args) {
        System.out.println(numberSearch("Hello6 9World 2,"));
    }

    public static int numberSearch(String str) {

        //빈 문자열을 입력 받은 경우
        if(str.length() == 0) {
            return 0;}

        //숫자만 있는 intStr 만들기
        String intStr = str.replaceAll("[^0-9]","");

        //숫자와 공백을 제외한 lengthStr 만들기
        String lengthStr = str.replaceAll("[0-9]","");
        lengthStr = lengthStr.replaceAll(" ","");

        //합을 구하기 위해 배열 안에 넣기
        char[] arr = intStr.toCharArray();

        //int 배열 선언
        int[] sumArr = new int[arr.length];

        //합을 담을 int 변수 선언
        int sum = 0;

        //return 할 double 변수 선언
        double result;

        // char 값 int 로 변환
        for(int i = 0 ; i < arr.length ; i ++) {
            sumArr[i] = arr[i] -'0';
        }

        //sumArr에 int 값 담기
        for(int i = 0; i < arr.length ; i ++) {
            sum += sumArr[i];
        }

        //합을 str의 길이만큼 나누기
        result = sum / lengthStr.length();
        return (int)Math.round(result);

    }
}
