package org.example;

import java.util.ArrayList;

public class Assets {

    public static String yellowTerminal = "\033[0;33m";

    public static String redTerminal = "\033[0;31m";

    public static String brightRedTerminal = "\033[0;91m";

    public static String greenTerminal = "\033[0;32m";

    public static String magentaTerminal = "\033[0;35m";

    public static String brightBlueTerminal = "\033[0;94m";
    public static String whiteTerminal = "\033[0;97m";

    public static String blueTerminal = "\033[0;34m";

    public static ArrayList<String> allColors = new ArrayList<>();


    public static String highLevelIcon = redTerminal+"♛"+whiteTerminal;
    public static String playerIcon = blueTerminal+"♞"+whiteTerminal;

    public static String treasureIcon = yellowTerminal+"⛁"+whiteTerminal;



    public static String legend =
            "                                         \n" +
            "  " + whiteTerminal + "Legend            \n" +
            "                                          \n" +
            "  "+ blueTerminal+"♞"+whiteTerminal+" = Player  \n" +
            "                                           \n" +
            "  ⛁ "+whiteTerminal+" = treasure                \n" +
            " \n" +
            "   "+redTerminal+"♛"+whiteTerminal+" = Enemy            \n" +
            " \n" +
            " \n" +
            " \n" +
            " \n" +
            " \n" +
            " \n" +
            " \n" +
            " \n"
            ;




    public static String smallHealthPotionPicture = "                     __ \n" +
            "                    (__)\n" +
            "                   <____>\n" +
            "                    )--(\n" +
            "                   /\\/\\/\\\n" +
            "                  /\\/\\/\\/\\\n" +
            "                  \\/\\/\\/\\/\n" +
            "                  /\\/\\/\\/\\\n" +
            "                 /\\/\\/\\/\\/\\    \n" +
            "                //\\\\//\\\\//\\\\   \n" +
            "               /\\\\//\\\\//\\\\//\\   \n" +
            "              |\\//\\\\//\\\\//\\\\/|   \n" +
            "              |/\\\\//\\\\//\\\\//\\|   \n" +
            "               \\/\\/\\/\\/\\/\\/\\/      \n" +
            "                \\/\\/\\/\\/\\/\\/        \n" +
            "                 `---------'     \n" +
            "                                 ";

    public static String dragonPicture =
            "                 ___====-_  _-====___\n" +
            "           _--^^^#####//      \\\\#####^^^--_\n" +
            "        _-^##########// (    ) \\\\##########^-_\n" +
            "       -############//  |\\^^/|  \\\\############-\n" +
            "     _/############//   (@::@)   \\\\############\\_\n" +
            "    /#############((     \\\\//     ))#############\\\n" +
            "   -###############\\\\    (oo)    //###############-\n" +
            "  -#################\\\\  / VV \\  //#################-\n" +
            " -###################\\\\/      \\//###################-\n" +
            "_#/|##########/\\######(   /\\   )######/\\##########|\\#_\n" +
            "|/ |#/\\#/\\#/\\/  \\#/\\##\\  |  |  /##/\\#/  \\/\\#/\\#/\\#| \\|\n" +
            "`  |/  V  V  `   V  \\#\\| |  | |/#/  V   '  V  V  \\|  '\n" +
            "   `   `  `      `   / | |  | | \\   '      '  '   '\n" +
            "                    (  | |  | |  )\n" +
            "                   __\\ | |  | | /__\n" +
            "                  (vvv(VVV)(VVV)vvv)";

    public static String skeletonPicture =
            "              .7\n" +
            "            .'/\n" +
            "           / /\n" +
            "          / /\n" +
            "         / /\n" +
            "        / /\n" +
            "       / /\n" +
            "      / /\n" +
            "     / /         \n" +
            "    / /          \n" +
            "  __|/\n" +
            ",-\\__\\\n" +
            "|f-\"Y\\|\n" +
            "\\()7L/\n" +
            " cgD                            __ _\n" +
            " |\\(                          .'  Y '>,\n" +
            "  \\ \\                        / _   _   \\\n" +
            "   \\\\\\                       )(_) (_)(|}\n" +
            "    \\\\\\                      {  4A   } /\n" +
            "     \\\\\\                      \\uLuJJ/\\l\n" +
            "      \\\\\\                     |3    p)/\n" +
            "       \\\\\\___ __________      /nnm_n//\n" +
            "       c7___-__,__-)\\,__)(\".  \\_>-<_/D\n" +
            "                  //V     \\_\"-._.__G G_c__.-__<\"/ ( \\\n" +
            "                         <\"-._>__-,G_.___)\\   \\7\\\n" +
            "                        (\"-.__.| \\\"<.__.-\" )   \\ \\\n" +
            "                        |\"-.__\"\\  |\"-.__.-\".\\   \\ \\\n" +
            "                        (\"-.__\"\". \\\"-.__.-\".|    \\_\\\n" +
            "                        \\\"-.__\"\"|!|\"-.__.-\".)     \\ \\\n" +
            "                         \"-.__\"\"\\_|\"-.__.-\"./      \\ l\n" +
            "                          \".__\"\"\">G>-.__.-\">       .--,_\n" +
            "                              \"\"  G";

    public static String reaperPicture =
            "                                           .\"\"--.._\n" +
                    "                                           []      `'--.._\n" +
                    "                                           ||__           `'-,\n" +
                    "                                         `)||_ ```'--..       \\\n" +
                    "                     _                    /|//}        ``--._  |\n" +
                    "                  .'` `'.                /////}              `\\/\n" +
                    "                 /  .\"\"\".\\              //{///    \n" +
                    "                /  /_  _`\\\\            // `||\n" +
                    "                | |(_)(_)||          _//   ||\n" +
                    "                | |  /\\  )|        _///\\   ||\n" +
                    "                | |L====J |       / |/ |   ||\n" +
                    "               /  /'-..-' /    .'`  \\  |   ||\n" +
                    "              /   |  :: | |_.-`      |  \\  ||\n" +
                    "             /|   `\\-::.| |          \\   | ||\n" +
                    "           /` `|   /    | |          |   / ||\n" +
                    "         |`    \\   |    / /          \\  |  ||\n" +
                    "        |       `\\_|    |/      ,.__. \\ |  ||\n" +
                    "        /                     /`    `\\ ||  ||\n" +
                    "       |           .         /        \\||  ||\n" +
                    "       |                     |         |/  ||\n" +
                    "       /         /           |         (   ||\n" +
                    "      /          .           /          )  ||\n" +
                    "     |            \\          |             ||\n" +
                    "    /             |          /             ||\n" +
                    "   |\\            /          |              ||\n" +
                    "   \\ `-._       |           /              ||\n" +
                    "    \\ ,//`\\    /`           |              ||\n" +
                    "     ///\\  \\  |             \\              ||\n" +
                    "    |||| ) |__/             |              ||\n" +
                    "    |||| `.(                |              ||\n" +
                    "    `\\\\` /`                 /              ||\n" +
                    "       /`                   /              ||\n" +
                    "      /                     |              ||\n" +
                    "     |                      \\              ||\n" +
                    "    /                        |             ||\n" +
                    "  /`                          \\            ||\n" +
                    "/`                            |            ||\n" +
                    "`-.___,-.      .-.        ___,'            ||\n" +
                    "         `---'`   `'----'`";

    public static String attackRustedBlow =
            "      /| ________________\n" +
            "O|===|* >________________>\n" +
            "      \\|";

    public static String attackFireBreath =
                    "   )\n" +
                    "  ) \\\n" +
                    " / ) (\n" +
                    " \\(_)/    ";

    public static ArrayList<String> initColors(){
        allColors.add(yellowTerminal);
        allColors.add(blueTerminal);
        allColors.add(redTerminal);
        allColors.add(brightRedTerminal);
        allColors.add(brightBlueTerminal);
        allColors.add(whiteTerminal);


        return allColors;

    }


}


