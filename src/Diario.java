import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import java.io.FileReader;
import java.io.IOException;

import static java.lang.Double.MAX_VALUE;
import static java.lang.Double.MIN_VALUE;

public class Diario {
    public static void main(String[] args) throws IOException {

        double[] valor;
        double maior=MIN_VALUE,menor=MAX_VALUE,total=0,media=0;
        int diasComVendaSuperior=0,diasComVenda=0;


        JSONParser parser = new JSONParser();
        try {
            //arquivo json
            JSONArray tmpArr = (JSONArray) parser.parse(new FileReader("E:\\UNIRIO\\vaga\\Vaga\\src\\dados.json"));
            valor = new double[tmpArr.size()];
            int i = 0;

            for(Object obj : tmpArr){
                JSONObject tmpObj = (JSONObject) obj;
                valor[i]=(Double)tmpObj.get("valor");
                i++;
            }

            for (i = 0; i<valor.length;i++){
                if (valor[i]==0){

                }else{
                    diasComVenda++;
                    total+=valor[i];
                    if (valor[i]>maior){
                        maior=valor[i];
                    }
                    if (valor[i]<menor){
                        menor=valor[i];
                    }
                }
            }

            media = total/diasComVenda;

            for (i = 0; i<valor.length;i++){
                if (valor[i]>media) {
                    diasComVendaSuperior++;
                }
            }

            System.out.println("O menor valor dentre os dias foi: "+menor);
            System.out.println("O maior valor dentre os dias foi: "+maior);
            System.out.println("O número de dias com vendas maiores que a média("+media+") é: "+diasComVendaSuperior);

        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
