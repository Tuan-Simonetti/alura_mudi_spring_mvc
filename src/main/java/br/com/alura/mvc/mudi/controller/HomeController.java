package br.com.alura.mvc.mudi.controller;

import br.com.alura.mvc.mudi.model.Pedido;
import br.com.alura.mvc.mudi.repository.PedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class HomeController {

    @Autowired
    private PedidoRepository pedidoRepository;

    @GetMapping("/home")
    public String home(Model model){
        List<Pedido> pedidos = pedidoRepository.findAll();
        model.addAttribute("pedidos", pedidos);
        return "home";
    }

//    public String home(Model model){
//        Pedido pedido = new Pedido();
//        pedido.setNomeProduto("Notebook Lenovo");
//        pedido.setUrlImagem("https://i.zst.com.br/images/notebook-lenovo-ideapad-s145-intel-core-i3-8130u-8-geracao-4gb-de-ram-hd-1-tb-15-6-windows-10-81xm0002br-photo1149213254-12-37-34.jpg");
//        pedido.setUrlProduto("www.teste.com");
//        pedido.setDescricao("Notebook Lenovo IdeaPad S145");
//        pedido.setDataEntrega("12 - 20 de Out");
//        pedido.setValorNegociado("R$ 2.747,20");
//
//        List<Pedido> pedidos = Arrays.asList(pedido);
//
//        model.addAttribute("pedidos", pedidos);
//
//        return "home";
//    }
}
