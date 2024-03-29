package com.wanderalvess.cloudsidentificationtabback;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;


@RestController
@RequestMapping("/api/image")
@CrossOrigin("*")
public class ImageController {
    //spring data rest repository
    // mock
    @GetMapping(value = "/images/weather", produces = MediaType.APPLICATION_JSON_VALUE + ";charset=UTF-8")
    public ResponseEntity<List<Image>> getImagesWeather(@RequestParam("name") String name) {
        List<Image> images = new ArrayList<>();
        System.out.println(name);
        if ("clear_day".equalsIgnoreCase(name)) {
            images.add(new Image(1, "clear_day", "https://i.postimg.cc/MnxTWt4r/clear-day.png"));
        } else if ("clear_night".equalsIgnoreCase(name)) {
            images.add(new Image(1, "clear_night", "https://i.postimg.cc/02BwmsDc/clear-night.png"));
        } else if ("cloud".equalsIgnoreCase(name)) {
            images.add(new Image(1, "cloud", "https://i.postimg.cc/FfCsVvK2/cloud.png"));
        } else if ("cloudly_day".equalsIgnoreCase(name)) {
            images.add(new Image(1, "cloudly_day", "https://i.postimg.cc/k6kJLyKs/cloudly-day.png"));
        } else if ("cloudly_night".equalsIgnoreCase(name)) {
            images.add(new Image(1, "cloudly_night", "https://i.postimg.cc/6276HP2T/cloudly-night.png"));
        } else if ("fog".equalsIgnoreCase(name)) {
            images.add(new Image(1, "fog", "https://i.postimg.cc/K4MvBdhH/fog.png"));
        } else if ("rain".equalsIgnoreCase(name)) {
            images.add(new Image(1, "rain", "https://i.postimg.cc/CKjBWntQ/rain.png"));
        } else if ("snow".equalsIgnoreCase(name)) {
            images.add(new Image(1, "snow", "https://i.postimg.cc/d0MZHjWC/snow.png"));
        } else if ("storm".equalsIgnoreCase(name)) {
            images.add(new Image(1, "storm", "https://i.postimg.cc/brFsQxDs/storm.png"));

        } else {

        }
        return ResponseEntity.ok(images);
    }

    @GetMapping(value = "/images/guide", produces = MediaType.APPLICATION_JSON_VALUE + ";charset=UTF-8")
    public ResponseEntity<List<Image>> getImagesGuide(@RequestParam("name") String name) {
        List<Image> images = new ArrayList<>();
        System.out.println(name);
        if ("guide".equalsIgnoreCase(name)) {
            images.add(new Image(1, "Guia de Identificação de Nuvens", "https://i.postimg.cc/1RDC3RW0/guia-identificacao-nuvens.jpg"));
        } else {

        }
        return ResponseEntity.ok(images);
    }

    @GetMapping(value = "/images", produces = MediaType.APPLICATION_JSON_VALUE + ";charset=UTF-8")
    public ResponseEntity<List<Image>> getImages(@RequestParam("category") String category) {
        List<Image> images = new ArrayList<>();
        System.out.println(category);
        if ("Cirrus".equalsIgnoreCase(category)) {
            images.add(new Image(1,
                    "Cirrus (Ci)",
                    "Nuvens finas e delicadas, muitas vezes em forma de filamentos ou penas, que se formam em altitudes elevadas. Elas são compostas principalmente de cristais de gelo.",
                    "https://i.postimg.cc/5tLdF8V8/cirrus1.jpg"));
            images.add(new Image(2,
                    "Cirrus Castellanus (Ci cas)",
                    "Cirrus bastante denso na forma de pequenas torres ou massas arredondadas e fibrosas que se erguem de uma base comum, e às vezes com aparência de ameias (amias de castelo). A largura aparente das protuberâncias em forma de torre pode ser menor ou maior que 1° quando observada em um ângulo superior a 30° acima do horizonte; distinto de Cirrocumulus castellanus onde a largura é inferior a 1°",
                    "https://i.postimg.cc/W4Rxjtkz/cirrus-castellanus.jpg"));
            images.add(new Image(3,
                    "Cirrus Fibratus (Ci fib)",
                    "Filamentos brancos quase retos ou mais ou menos curvados irregularmente, sempre finos e não terminando em ganchos ou tufos. Os filamentos são, em sua maioria, distintos uns dos outros.",
                    "https://i.postimg.cc/4xHjrpnj/cirrus-fibratus.jpg"));
            images.add(new Image(4,
                    "Cirrus Floccus (Ci flo)",
                    "Cirrus em forma de tufos pequenos, arredondados, mais ou menos isolados, muitas vezes com trilhas. A largura aparente dos tufos pode ser menor ou maior que 1° quando observados em um ângulo superior a 30° acima do horizonte; distinto de Cirrocumulus castellanus onde a largura é inferior a 1°.",
                    "https://i.postimg.cc/Zqr2qZ8c/cirrus-floccus.jpg"));
            images.add(new Image(5,
                    "Cirrus Spissatus (Ci spi)",
                    "Cirrus em manchas, suficientemente densos para parecerem acinzentados quando vistos em direção ao sol; também pode velar o Sol, obscurecer o seu contorno ou mesmo ocultá-lo. Cirrus spissatus geralmente se origina da parte superior de um Cumulonimbus.",
                    "https://i.postimg.cc/1tsTnTMZ/cirrus-spissatus.jpg"));
            images.add(new Image(6,
                    "Cirrus Uncinus (Ci unc)",
                    "Cirrus sem partes cinzentas, muitas vezes em forma de vírgula, terminando no topo em gancho, ou em tufo, cuja parte superior não tem forma de protuberância.",
                    "https://i.postimg.cc/kXBHbWND/cirrus-uncinus.jpg"));

        } else if ("Stratus".equalsIgnoreCase(category)) {
            images.add(new Image(7,
                    "Stratus (St)",
                    "Camada de nuvens geralmente cinzenta com base bastante uniforme, podendo originar garoa, neve ou grãos de neve. Quando o Sol é visível através da nuvem, o seu contorno é claramente discernível. Stratus não produz fenômenos de halo, exceto, possivelmente, em temperaturas muito baixas.\n" +
                            "\n" +
                            "Às vezes, Stratus aparece na forma de manchas irregulares.",
                    "https://i.postimg.cc/9MLx4frG/stratus-fractus.jpg"));
            images.add(new Image(8,
                    "Stratus Fractus (St fra)",
                    "Stratus ocorrendo na forma de fragmentos irregulares e irregulares, cujos contornos mudam continuamente e muitas vezes rapidamente..",
                    "https://i.postimg.cc/9MLx4frG/stratus-fractus.jpg"));
            images.add(new Image(9,
                    "Stratus Nebulosus (St neb)",
                    "Camada nebulosa, cinzenta e bastante uniforme de Stratus. Esta é a espécie mais comum.",
                    "https://i.postimg.cc/43b2gPG2/stratus-nebulosus.jpg"));
            images.add(new Image(10,
                    "Stratus Opacus (St op)",
                    "Remendo, folha ou camada de Stratus, cuja maior parte é tão opaca que mascara completamente o Sol ou a Lua. Esta é a variedade mais comum.",
                    "https://i.postimg.cc/y6rQskqK/stratus-opacus.jpg"));
            images.add(new Image(11,
                    "Stratus Translucidus (St tr) ",
                    "Remendo, folha ou camada de Stratus, cuja maior parte é suficientemente translúcida para revelar o contorno do Sol ou da Lua.",
                    "https://i.postimg.cc/BbyMgw5b/stratus-translucidus.jpg"));
            images.add(new Image(12,
                    "Stratus Undulatus (St un)",
                    "Stratus que exibem padrões ondulados ou estriados. Esta variedade não ocorre com muita frequência.",
                    "https://i.postimg.cc/sDQnXsyh/stratus-undulatus.jpg"));

        } else if ("Stratocumulus".equalsIgnoreCase(category)) {
            images.add(new Image(13,
                    "Stratocumulus (Sc)",
                    "Cinzento ou esbranquiçado, ou simultaneamente cinzento e esbranquiçado, mancha, lençol ou camada de nuvem quase sempre com partes escuras, composta por tesselações, massas arredondadas, rolos, etc., não fibrosas (excepto virga) e que podem ou não podem ser mesclados; a maioria dos pequenos elementos dispostos regularmente tem uma largura aparente superior a 5°.",
                    "https://i.postimg.cc/KcHzk3CY/stratocumulus.jpg"));
            images.add(new Image(14,
                    "Stratocumulus Stratiformis (Sc str)",
                    "Stratocumulus que cobrem o céu em camadas uniformes e contínuas. Os elementos são mais ou menos achatados. Esta espécie é a mais comum.",
                    "https://i.postimg.cc/wTRBhTdQ/stratocumulus-stratiformis.jpg"));
            images.add(new Image(15,
                    "Stratocumulus Castellanus (Sc cas)",
                    "Stratocumulus com protuberâncias verticais semelhantes a torres ou castelos.",
                    "https://i.postimg.cc/FFwvXMYP/stratocumulus-castellanus.jpg"));
            images.add(new Image(16,
                    "Stratocumulus Lenticularis (Sc len)",
                    "Uma mancha de Stratocumulus, em forma de lente ou amêndoa, muitas vezes muito alongada e geralmente com contornos bem definidos. A mancha é composta por pequenos elementos (uma largura aparente superior a 5° quando observada em um ângulo superior a 30° acima do horizonte), agrupados estreitamente, ou consiste em uma unidade mais ou menos lisa e geralmente escura. A irização é possível.\n" +
                            "\n" +
                            "Esta espécie de Stratocumulus é bastante rara.",
                    "https://i.postimg.cc/CMR0thxB/stratocumulus-lenticularis.jpg"));
            images.add(new Image(17,
                    "Stratocumulus Volutus (Sc vol)",
                    "Uma massa de nuvem longa, horizontal, destacada e em forma de tubo, muitas vezes parecendo rolar lentamente em torno de um eixo horizontal. Eles geralmente ocorrem de forma singular, mas ocasionalmente são observados em linhas sucessivas de nuvens.\n" +
                            "\n" +
                            "Esta espécie de Stratocumulus é rara.",
                    "https://i.postimg.cc/XqRQ1c78/stratocumulus-volutus.jpg"));

        } else if ("Altocumulus".equalsIgnoreCase(category)) {
            images.add(new Image(18,
                    "Altocumulus (Ac)",
                    "Mancha, folha ou camada de nuvem branca ou cinzenta, ou branca e cinzenta, geralmente com sombreamento, composta por lâminas, massas arredondadas, rolos, etc., por vezes parcialmente fibrosas ou difusas e que podem ou não estar fundidas; a maioria dos pequenos elementos dispostos regularmente geralmente têm uma largura aparente entre 1° e 5°.",
                    "https://i.postimg.cc/Wz9QPnGc/altocumulus.jpg"));
            images.add(new Image(19,
                    "Altocumulus Castellanus (Ac cas)",
                    "Torres cumuliformes elevando-se verticalmente a partir de elementos de nuvem conectados por uma base horizontal comum. As torres:\n" +
                            "\n" +
                            "Parecem estar dispostos em linhas,\n" +
                            "Dê à nuvem uma aparência de ameias (ameias de castelo),\n" +
                            "Às vezes são mais altos do que largos,\n" +
                            "São especialmente evidentes quando a nuvem é vista de lado.\n" +
                            "\n" +
                            "Altocumulus castellanus é um indicador de instabilidade nesse nível; quando adquire extensão vertical considerável, é classificado como:\n" +
                            "\n" +
                            "Cumulus congestus altocumulogenitus, se brotar fortemente ou for de grande extensão vertical,\n" +
                            "Cumulonimbus altocumulogenitus, se parte de sua porção superior for lisa, fibrosa ou estriada, ou se a nuvem produzir raios, trovões ou chuvas de granizo.",
                    "https://i.postimg.cc/653kfkKW/altocumulus-castellanus.jpg"));
            images.add(new Image(20,
                    "Altocumulus Floccus (Ac flo)",
                    "Pequenos tufos de aspecto cumuliforme; as partes inferiores dos tufos são geralmente irregulares e muitas vezes acompanhadas por trilhas fibrosas (cristal de gelo virga). Altocumulus floccus é uma indicação de instabilidade nesse nível. Altocumulus floccus às vezes se forma como resultado da dissipação da base do Altocumulus castellanus.",
                    "https://i.postimg.cc/hv4Hww70/altocumulus-floccus.jpg"));
            images.add(new Image(21,
                    "Altocumulus Lenticularis (Ac len)",
                    "Uma mancha em forma de lente ou amêndoa, muitas vezes muito alongada e geralmente com contornos bem definidos. O patch pode ser composto por pequenos elementos, agrupados; ou uma unidade geralmente lisa com matizes pronunciados.",
                    "https://i.postimg.cc/bJ97m8dJ/altocumulus-lenticularis.jpg"));
            images.add(new Image(22,
                    "Altocumulus Stratiformis (Ac str)",
                    "Uma extensa folha ou camada de elementos separados ou mesclados. Esta é de longe a espécie que ocorre com mais frequência.",
                    "https://i.postimg.cc/G3q0YcZg/altocumulus-stratiformis.jpg"));
            images.add(new Image(23,
                    "Altocumulus Translucidus",
                    "Altocumulus que são finos o suficiente para permitir a passagem da luz solar.",
                    "https://i.postimg.cc/QxyR4fNp/altocumulus-translucidus.jpg"));
            images.add(new Image(24,
                    "Altocumulus Volutus (Ac vol)",
                    "Uma massa de nuvem longa, horizontal, destacada e em forma de tubo, muitas vezes parecendo rolar lentamente em torno de um eixo horizontal. Geralmente ocorre como uma linha única e raramente se estende de horizonte a horizonte.\n" +
                            "\n" +
                            "Esta espécie de Altocumulus é rara.",
                    "https://i.postimg.cc/pTvNQyW4/altocumulus-volutus.jpg"));

        } else if ("Cumulonimbus".equalsIgnoreCase(category)) {
            images.add(new Image(25,
                    "Cumulonimbus (Cb)",
                    "Nuvem pesada e densa, com considerável extensão vertical, em forma de montanha ou de enormes torres. Pelo menos parte de sua porção superior é geralmente lisa, ou fibrosa ou estriada, e quase sempre achatada; esta parte geralmente se espalha na forma de uma bigorna ou de uma vasta pluma.\n" +
                            "\n" +
                            "Sob a base desta nuvem, que é frequentemente muito escura, existem frequentemente nuvens baixas e irregulares, fundidas com ela ou não, e precipitação por vezes sob a forma de virga.",
                    "https://i.postimg.cc/Bbwwzv3q/cumulonimbus.jpg"));
            images.add(new Image(26,
                    "Cumulonimbus Calvus (Cb cal)",
                    "Cumulonimbus onde os brotos das partes superiores são indistintos e achatados e apresentam aspecto de massa esbranquiçada sem contornos nítidos. Nenhuma parte fibrosa ou estriada é visível. Cumulonimbus calvus geralmente produz precipitação; quando chega ao solo, é em forma de chuva.",
                    "https://i.postimg.cc/HnLh3yfZ/cumulonimbus-calvus.jpg"));
            images.add(new Image(27,
                    "Cumulonimbus Capillatus (Cb cap)",
                    "Cumulonimbus cuja porção superior apresenta partes cirriformes de estrutura claramente fibrosa ou estriada, frequentemente em forma de bigorna (Cumulonimbus capillatus incus), de pluma ou de vasta massa desordenada de pêlos. Em massas de ar muito frias, a estrutura fibrosa muitas vezes estende-se virtualmente por toda a nuvem.\n" +
                            "\n" +
                            "Cumulonimbus capillatus é geralmente acompanhado de aguaceiro ou trovoada, muitas vezes com rajadas de vento e às vezes com granizo; freqüentemente produz virga muito distinto.",
                    "https://i.postimg.cc/c1DjCFnV/cumulonimbus-capillatus.jpg"));

        } else if ("Nimbostratus".equalsIgnoreCase(category)) {
            images.add(new Image(28,
                    "Nimbostratus (Ns)",
                    "Camada de nuvens cinzentas, muitas vezes escuras, cuja aparência se torna difusa pela queda mais ou menos contínua de chuva ou neve, que, na maioria dos casos, atinge o solo. É espesso o suficiente para bloquear o sol.\n" +
                            "\n" +
                            "Nuvens baixas e irregulares ocorrem frequentemente abaixo da camada, com as quais podem ou não se fundir.",
                    "https://i.postimg.cc/prfm4CZc/Nimbostratus.jpg"));

        } else if ("Cirrostratus".equalsIgnoreCase(category)) {
            images.add(new Image(29,
                    "Cirrostratus (Cs)",
                    "Véu de nuvem transparente, esbranquiçado, de aspecto fibroso (semelhante a cabelo) ou liso, cobrindo total ou parcialmente o céu, muitas vezes produzindo fenômenos de halo.",
                    "https://i.postimg.cc/m25tXQ3X/Cirrostratus.jpg"));
            images.add(new Image(30,
                    "Cirrostratus duplicatus (Cs du)",
                    "Cirrostratus dispostos em folhas ou camadas sobrepostas, em níveis ligeiramente diferentes, às vezes parcialmente mesclados.",
                    "https://i.postimg.cc/CLw72wv5/Cirrostratus-duplicatus.jpg"));
            images.add(new Image(31,
                    "Cirrostratus undulatus (Cs un)",
                    "Cirrostratus mostrando ondulações.",
                    "https://i.postimg.cc/C5sNK2Kw/Cirrostratus-undulatus.jpg"));

        } else if ("Cirrocumulus".equalsIgnoreCase(category)) {
            images.add(new Image(32,
                    "Cirrocumulus (Cc)",
                    "Mancha fina, branca, folha ou camada de nuvem sem sombreamento, composta por elementos muito pequenos em forma de grãos, ondulações, etc., mesclados ou separados, e dispostos mais ou menos regularmente; a maioria dos elementos tem uma largura aparente inferior a 1°.",
                    "https://i.postimg.cc/MXwTKsFb/Cirrocumulus.jpg"));
            images.add(new Image(33,
                    "Cirrocumulus lacunosus (Cc la)",
                    "Cirrocumulus em mancha, folha ou camada, apresentando pequenos orifícios redondos distribuídos mais ou menos regularmente, muitos deles com bordas franjadas. Elementos de nuvem e espaços claros são frequentemente organizados como uma rede ou um favo de mel.",
                    "https://i.postimg.cc/bG2XQhsD/Cirrocumulus-lacunosus.jpg"));
            images.add(new Image(34,
                    "Cirrocumulus undulatus (Cc un)",
                    "Cirrocumulus mostrando um ou dois sistemas de ondulações.",
                    "https://i.postimg.cc/D46R2fYD/Cirrocumulus-undulatus.jpg"));

        } else if ("Altostratus".equalsIgnoreCase(category)) {
            images.add(new Image(35,
                    "Altostratus (As)",
                    "Folha ou camada de nuvens acinzentadas ou azuladas de aparência estriada, fibrosa ou uniforme, cobrindo total ou parcialmente o céu, e com partes finas o suficiente para revelar o Sol pelo menos vagamente, como através de vidro fosco. Altostratus não apresenta fenômenos de halo.",
                    "https://i.postimg.cc/Mfqh2ftV/Altostratus.jpg"));
            images.add(new Image(36,
                    "Altostratus translucidus (As tr)",
                    "Altostratus, cuja maior parte é suficientemente translúcida para revelar a posição do Sol ou da Lua.",
                    "https://i.postimg.cc/1npLjr0y/Altostratus-translucidus.jpg"));
            images.add(new Image(37,
                    "Altostratus duplicatus (As du)",
                    "Altostratus composto por duas ou mais camadas sobrepostas, em níveis ligeiramente diferentes, às vezes parcialmente fundidas. Esta variedade raramente é vista em Altostratus.",
                    "https://i.postimg.cc/C5sNK2Kw/Cirrostratus-undulatus.jpg"));
            images.add(new Image(38,
                    "Altostratus undulatus (As un)",
                    "Altostratus mostrando ondulações.",
                    "https://i.postimg.cc/RqT037rr/Altostratus-undulatus.jpg"));
            images.add(new Image(39,
                    "Altostratus opacus (As op)",
                    "Altostratus, cuja maior parte é suficientemente opaca para mascarar completamente o Sol ou a Lua.",
                    "https://i.postimg.cc/N9h3DzHN/Altostratus-opacus.jpg"));
            images.add(new Image(40,
                    "Altostratus radiatus (As ra)",
                    "Altostratus mostrando largas faixas paralelas que parecem convergir para um ponto ou para dois pontos opostos do horizonte. Esta variedade raramente é vista em Altostratus.",
                    "]https://i.postimg.cc/PC7spxrn/Altostratus-radiatus.jpg"));

        } else if ("Cumulus".equalsIgnoreCase(category)) {
            images.add(new Image(41,
                    "Cumulus",
                    "Nuvens brancas e fofas com bases planas e topos arredondados, encontradas em altitudes médias.",
                    "https://i.postimg.cc/3R1qgBb0/cumulus.jpg"));
            images.add(new Image(42
                    , "Cumulus Congestus",
                    "Cumulus que se desenvolvem verticalmente em grandes torres, indicando instabilidade atmosférica.",
                    "https://i.postimg.cc/NjXPNYzc/cumulus-congestus.jpg"));
            images.add(new Image(43,
                    "Cumulus Fractus",
                    "Cumulus quebrados ou fragmentados, muitas vezes associados a tempo instável.",
                    "https://i.postimg.cc/TYF4qhQ0/cumulus-fractus.jpg"));
            images.add(new Image(44,
                    "Cumulus Humilis",
                    "Cumulus de pequena estatura, indicativos de tempo calmo e estável.",
                    "https://i.postimg.cc/HLCvRKq7/cumulus-humilis.jpg"));
            images.add(new Image(45,
                    "Cumulus Mediocris",
                    "Cumulus de altura média, entre o humilis e o congestus.",
                    "https://i.postimg.cc/5047NzN4/cumulus-mediocris.jpg"));
            images.add(new Image(46,
                    "Cumulus Radiatus",
                    "Cumulus com bases paralelas, criando uma aparência de \"rugas\" no céu.",
                    "https://i.postimg.cc/4ynWpT9j/cumulus-radiatus.jpg"));

        } else {
            // Lógica para tratar categorias desconhecidas ou erro
            // Neste exemplo, estou retornando uma lista vazia para categorias desconhecidas.
        }

        return ResponseEntity.ok(images);
    }
}

