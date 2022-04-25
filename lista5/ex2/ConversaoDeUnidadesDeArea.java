
public class ConversaoDeUnidadesDeArea {
    private float resultado = 0;
    private static final double METRO_QUADRADO = 10.76; //METRO
    private static final double PE_QUADRADO = 929; //CM
    private static final double MILHA_QUADRADO = 640; //ACRE
    private static final double ACRE_QUADRADO = 43560; //PES
    
    ConversaoDeUnidadesDeArea(){
        
    }
    
    public static double metroQuadrado(double medida){
        return (medida*METRO_QUADRADO);
    } 
    
    public static double peQuadrado(double medida){
        return (medida*PE_QUADRADO);
    }
    
    public static double milhaQuadrada(double medida){
        return (medida*MILHA_QUADRADO);
    }
    
    public static double acreQuadrado(double medida){
        return (medida*ACRE_QUADRADO);
    }
    
    public static double peParaAcre(double pe){
        return (pe/ACRE_QUADRADO);
    }
            
    public static void printaMedidas(double medida){
        double aux = 0;
        double pe = metroQuadrado(medida);
        System.out.println("pés: " + pe);
        aux = peQuadrado(pe);
        System.out.println("centimetros: " + aux);
        aux = peParaAcre(pe);
        System.out.println("acres: " + aux);
        
    }
}


