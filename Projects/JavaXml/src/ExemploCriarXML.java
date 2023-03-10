import java.io.File;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import javax.swing.JOptionPane;
 
public class ExemploCriarXML {
 
    public static final String xmlFilePath = "C:\\Users\\julio\\OneDrive\\Documentos\\AULA0911XML\\arquivo.xml";
 
    public static void main(String argv[]) {
    	
    	String nome = JOptionPane.showInputDialog("\nNome: ");
    	String sobrenome = JOptionPane.showInputDialog("\nSobrenome: ");
    	String emaill = JOptionPane.showInputDialog("\nEmail: ");
    	String empresa = JOptionPane.showInputDialog("\nEmpresa: ");
    	String data = JOptionPane.showInputDialog("\nData de nascimento: ");
    	String cpf = JOptionPane.showInputDialog("\nCPF: ");
    	
        try {
 
            DocumentBuilderFactory documentFactory = DocumentBuilderFactory.newInstance();
 
            DocumentBuilder documentBuilder = documentFactory.newDocumentBuilder();
 
            Document document = documentBuilder.newDocument();
 
            // empresa
            Element raiz = document.createElement("empresa");
            document.appendChild(raiz);
 
            // funcionario
            Element funcionario = document.createElement("funcionario");
 
            raiz.appendChild(funcionario);
 
            Attr identificacao = document.createAttribute("id");
            identificacao.setValue("10");
            funcionario.setAttributeNode(identificacao);
 
            // Primeiro nome
            Element Prim_Nome = document.createElement("primeiro_nome");
            Prim_Nome.appendChild(document.createTextNode(nome));
            funcionario.appendChild(Prim_Nome);
 
            // Sobrenome
            Element Sob_Nome = document.createElement("sobrenome");
            Sob_Nome.appendChild(document.createTextNode(sobrenome));
            funcionario.appendChild(Sob_Nome);
 
            // email
            Element email = document.createElement("email");
            email.appendChild(document.createTextNode(emaill));
            funcionario.appendChild(email);
 
            // departamento
            Element departmento = document.createElement("departmento");
            departmento.appendChild(document.createTextNode(empresa));
            funcionario.appendChild(departmento);
            
            // Ano de nascimento
            Element nascimento = document.createElement("nascimento");
            nascimento.appendChild(document.createTextNode(data));
            funcionario.appendChild(nascimento);
            
            //CPF
            Element documentocpf = document.createElement("documentocpf");
            documentocpf.appendChild(document.createTextNode(cpf));
            funcionario.appendChild(documentocpf);
 
            // crir o arquivo xml
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            DOMSource domSource = new DOMSource(document);
            StreamResult streamResult = new StreamResult(new File(xmlFilePath));

 
            transformer.transform(domSource, streamResult);
 
            System.out.println("XML criado com sucesso");
 
        } catch (ParserConfigurationException pce) {
            pce.printStackTrace();
        } catch (TransformerException tfe) {
            tfe.printStackTrace();
        }
    }
}