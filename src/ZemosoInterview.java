public class ZemosoInterview {

    public int solution(int N, int K){
int count = 0, rem=0;
        if(K == 0){
            return N-1;
        }
        while (K>0 && N/2 >0){
            rem = rem+ N%2;
            N/=2;
            count++;
            K--;
        }
        rem = rem+N;
        while (rem>1){
            rem--;
            count++;
        }
        return count;

    }
}
