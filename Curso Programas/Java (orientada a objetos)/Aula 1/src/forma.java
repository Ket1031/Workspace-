public class forma{
    float largura, comprimento, base;

    public float calAreaRetangulo() {
        float area = largura * comprimento;
        return area;
    }

    public float calAreaTriangulo(){
        float area = (base * comprimento)/2;
        return area;

    }
}

