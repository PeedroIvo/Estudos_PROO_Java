package pacoteteste;

public class HorarioAtual {
    
    public static void main(String[] args){
        
        long totalMiliSeg = System.currentTimeMillis() - 10800000;
        
        long totalSeg = totalMiliSeg / 1000;
        long segAtual = totalSeg % 60;
        
        long totalMin = totalSeg / 60;
        long minAtual = totalMin % 60;
        
        long totalHoras = totalMin / 60;
        long horaAtual = totalHoras % 24;
        
        System.out.println(horaAtual + ":" + minAtual + ":" + segAtual);
        
    }
    
}
