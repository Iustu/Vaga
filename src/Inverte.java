public class Inverte {
    public static void main(String[] args) {
        String input = "Banana";

        char vetor[] = new char[input.length()];

        for (int i=0;i<input.length();i++){
            vetor[i]=input.charAt(i);
        }

        int k = 1;
        for (int i=0;i<input.length()/2;i++){
            char aux = vetor[i];
            vetor[i]=vetor[input.length()-k];
            vetor[input.length()-k]=aux;
            k++;
        }

        String output = "";
        for (int i=0;i<input.length();i++){
            output=output+vetor[i];
        }

        System.out.println(output);
    }
}
