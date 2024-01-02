import java.io.*;




public class loop {
    public static void main(String[] args) throws IOException {
        // input get for Buffered Reader use ---------------------
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine().trim());
//        for(int i =1; i<=10; i++){
            for (int j =1; j<=10; j++){
                System.out.println(N+"X"+j+"="+N*j);
            }
//        }

        bufferedReader.close();
    }
}


