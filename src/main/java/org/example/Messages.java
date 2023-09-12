package org.example;

import java.util.ArrayList;

public  class  Messages {

    public static String yourTurn =
            Assets.greenTerminal +
                    "$$\\     $$\\                                   $$$$$$$$\\                            \n" +
                    "\\$$\\   $$  |                                  \\__$$  __|                           \n" +
                    " \\$$\\ $$  /$$$$$$\\  $$\\   $$\\  $$$$$$\\           $$ |$$\\   $$\\  $$$$$$\\  $$$$$$$\\  \n" +
                    "  \\$$$$  /$$  __$$\\ $$ |  $$ |$$  __$$\\          $$ |$$ |  $$ |$$  __$$\\ $$  __$$\\ \n" +
                    "   \\$$  / $$ /  $$ |$$ |  $$ |$$ |  \\__|         $$ |$$ |  $$ |$$ |  \\__|$$ |  $$ |\n" +
                    "    $$ |  $$ |  $$ |$$ |  $$ |$$ |               $$ |$$ |  $$ |$$ |      $$ |  $$ |\n" +
                    "    $$ |  \\$$$$$$  |\\$$$$$$  |$$ |               $$ |\\$$$$$$  |$$ |      $$ |  $$ |\n" +
                    "    \\__|   \\______/  \\______/ \\__|               \\__| \\______/ \\__|      \\__|  \\__|"
                    + Assets.whiteTerminal;

    public static String health =
            " /$$   /$$                     /$$   /$$     /$$      \n" +
            "| $$  | $$                    | $$  | $$    | $$      \n" +
            "| $$  | $$  /$$$$$$   /$$$$$$ | $$ /$$$$$$  | $$$$$$$ \n" +
            "| $$$$$$$$ /$$__  $$ |____  $$| $$|_  $$_/  | $$__  $$\n" +
            "| $$__  $$| $$$$$$$$  /$$$$$$$| $$  | $$    | $$  \\ $$\n" +
            "| $$  | $$| $$_____/ /$$__  $$| $$  | $$ /$$| $$  | $$\n" +
            "| $$  | $$|  $$$$$$$|  $$$$$$$| $$  |  $$$$/| $$  | $$\n" +
            "|__/  |__/ \\_______/ \\_______/|__/   \\___/  |__/  |__/\n" +
            "                                                      ";

    public static String potion =
            " /$$$$$$$             /$$     /$$                    \n" +
            "| $$__  $$           | $$    |__/                    \n" +
            "| $$  \\ $$ /$$$$$$  /$$$$$$   /$$  /$$$$$$  /$$$$$$$ \n" +
            "| $$$$$$$//$$__  $$|_  $$_/  | $$ /$$__  $$| $$__  $$\n" +
            "| $$____/| $$  \\ $$  | $$    | $$| $$  \\ $$| $$  \\ $$\n" +
            "| $$     | $$  | $$  | $$ /$$| $$| $$  | $$| $$  | $$\n" +
            "| $$     |  $$$$$$/  |  $$$$/| $$|  $$$$$$/| $$  | $$\n" +
            "|__/      \\______/    \\___/  |__/ \\______/ |__/  |__/\n" +
            "                                                     ";

    public static String small =
            "  /$$$$$$                          /$$ /$$\n" +
            " /$$__  $$                        | $$| $$\n" +
            "| $$  \\__/ /$$$$$$/$$$$   /$$$$$$ | $$| $$\n" +
            "|  $$$$$$ | $$_  $$_  $$ |____  $$| $$| $$\n" +
            " \\____  $$| $$ \\ $$ \\ $$  /$$$$$$$| $$| $$\n" +
            " /$$  \\ $$| $$ | $$ | $$ /$$__  $$| $$| $$\n" +
            "|  $$$$$$/| $$ | $$ | $$|  $$$$$$$| $$| $$\n" +
            " \\______/ |__/ |__/ |__/ \\_______/|__/|__/\n" +
            "                                          \n" +
            "                                          ";



    public static String enemyTurn =
            Assets.redTerminal +
                    "$$$$$$$$\\                                                   $$$$$$$$\\                            \n" +
                    "$$  _____|                                                  \\__$$  __|                           \n" +
                    "$$ |      $$$$$$$\\   $$$$$$\\  $$$$$$\\$$$$\\  $$\\   $$\\          $$ |$$\\   $$\\  $$$$$$\\  $$$$$$$\\  \n" +
                    "$$$$$\\    $$  __$$\\ $$  __$$\\ $$  _$$  _$$\\ $$ |  $$ |         $$ |$$ |  $$ |$$  __$$\\ $$  __$$\\ \n" +
                    "$$  __|   $$ |  $$ |$$$$$$$$ |$$ / $$ / $$ |$$ |  $$ |         $$ |$$ |  $$ |$$ |  \\__|$$ |  $$ |\n" +
                    "$$ |      $$ |  $$ |$$   ____|$$ | $$ | $$ |$$ |  $$ |         $$ |$$ |  $$ |$$ |      $$ |  $$ |\n" +
                    "$$$$$$$$\\ $$ |  $$ |\\$$$$$$$\\ $$ | $$ | $$ |\\$$$$$$$ |         $$ |\\$$$$$$  |$$ |      $$ |  $$ |\n" +
                    "\\________|\\__|  \\__| \\_______|\\__| \\__| \\__| \\____$$ |         \\__| \\______/ \\__|      \\__|  \\__|\n" +
                    "                                            $$\\   $$ |                                           \n" +
                    "                                            \\$$$$$$  |                                           \n" +
                    "                                             \\______/                                            "
                    + Assets.whiteTerminal;

    public static String textRust =
            "$$$$$$$\\                        $$\\           \n" +
                    "$$  __$$\\                       $$ |          \n" +
                    "$$ |  $$ |$$\\   $$\\  $$$$$$$\\ $$$$$$\\         \n" +
                    "$$$$$$$  |$$ |  $$ |$$  _____|\\_$$  _|        \n" +
                    "$$  __$$< $$ |  $$ |\\$$$$$$\\    $$ |          \n" +
                    "$$ |  $$ |$$ |  $$ | \\____$$\\   $$ |$$\\       \n" +
                    "$$ |  $$ |\\$$$$$$  |$$$$$$$  |  \\$$$$  |      \n" +
                    "\\__|  \\__| \\______/ \\_______/    \\____/       \n" +
                    "                                              \n" +
                    "                                              \n" +
                    "                                              ";
    public static String textEffect =
            "$$$$$$$$\\  $$$$$$\\   $$$$$$\\                       $$\\     \n" +
                    "$$  _____|$$  __$$\\ $$  __$$\\                      $$ |    \n" +
                    "$$ |      $$ /  \\__|$$ /  \\__|$$$$$$\\   $$$$$$$\\ $$$$$$\\   \n" +
                    "$$$$$\\    $$$$\\     $$$$\\    $$  __$$\\ $$  _____|\\_$$  _|  \n" +
                    "$$  __|   $$  _|    $$  _|   $$$$$$$$ |$$ /        $$ |    \n" +
                    "$$ |      $$ |      $$ |     $$   ____|$$ |        $$ |$$\\ \n" +
                    "$$$$$$$$\\ $$ |      $$ |     \\$$$$$$$\\ \\$$$$$$$\\   \\$$$$  |\n" +
                    "\\________|\\__|      \\__|      \\_______| \\_______|   \\____/ \n" +
                    "                                                           \n" +
                    "                                                           \n" +
                    "                                                           ";

    public static String textActive =
            " $$$$$$\\              $$\\     $$\\                      \n" +
                    "$$  __$$\\             $$ |    \\__|                     \n" +
                    "$$ /  $$ | $$$$$$$\\ $$$$$$\\   $$\\ $$\\    $$\\  $$$$$$\\  \n" +
                    "$$$$$$$$ |$$  _____|\\_$$  _|  $$ |\\$$\\  $$  |$$  __$$\\ \n" +
                    "$$  __$$ |$$ /        $$ |    $$ | \\$$\\$$  / $$$$$$$$ |\n" +
                    "$$ |  $$ |$$ |        $$ |$$\\ $$ |  \\$$$  /  $$   ____|\n" +
                    "$$ |  $$ |\\$$$$$$$\\   \\$$$$  |$$ |   \\$  /   \\$$$$$$$\\ \n" +
                    "\\__|  \\__| \\_______|   \\____/ \\__|    \\_/     \\_______|\n" +
                    "                                                       \n" +
                    "                                                       \n" +
                    "                                                       ";

    static String failedAttack =
            Assets.redTerminal +
            " $$$$$$\\    $$\\     $$\\                         $$\\             $$$$$$$$\\       $$\\ $$\\                 $$\\ \n" +
            "$$  __$$\\   $$ |    $$ |                        $$ |            $$  _____|      \\__|$$ |                $$ |\n" +
            "$$ /  $$ |$$$$$$\\ $$$$$$\\    $$$$$$\\   $$$$$$$\\ $$ |  $$\\       $$ |   $$$$$$\\  $$\\ $$ | $$$$$$\\   $$$$$$$ |\n" +
            "$$$$$$$$ |\\_$$  _|\\_$$  _|   \\____$$\\ $$  _____|$$ | $$  |      $$$$$\\ \\____$$\\ $$ |$$ |$$  __$$\\ $$  __$$ |\n" +
            "$$  __$$ |  $$ |    $$ |     $$$$$$$ |$$ /      $$$$$$  /       $$  __|$$$$$$$ |$$ |$$ |$$$$$$$$ |$$ /  $$ |\n" +
            "$$ |  $$ |  $$ |$$\\ $$ |$$\\ $$  __$$ |$$ |      $$  _$$<        $$ |  $$  __$$ |$$ |$$ |$$   ____|$$ |  $$ |\n" +
            "$$ |  $$ |  \\$$$$  |\\$$$$  |\\$$$$$$$ |\\$$$$$$$\\ $$ | \\$$\\       $$ |  \\$$$$$$$ |$$ |$$ |\\$$$$$$$\\ \\$$$$$$$ |\n" +
            "\\__|  \\__|   \\____/  \\____/  \\_______| \\_______|\\__|  \\__|      \\__|   \\_______|\\__|\\__| \\_______| \\_______|\n" +
            "                                                                                                            "
            + Assets.whiteTerminal
            ;

    static String successfulAttack =
            Assets.greenTerminal +
            "  /$$$$$$    /$$     /$$                         /$$                                                                         /$$$$$$           /$$\n" +
            " /$$__  $$  | $$    | $$                        | $$                                                                        /$$__  $$         | $$\n" +
            "| $$  \\ $$ /$$$$$$ /$$$$$$    /$$$$$$   /$$$$$$$| $$   /$$        /$$$$$$$ /$$   /$$  /$$$$$$$  /$$$$$$   /$$$$$$$ /$$$$$$$| $$  \\__//$$   /$$| $$\n" +
            "| $$$$$$$$|_  $$_/|_  $$_/   |____  $$ /$$_____/| $$  /$$/       /$$_____/| $$  | $$ /$$_____/ /$$__  $$ /$$_____//$$_____/| $$$$   | $$  | $$| $$\n" +
            "| $$__  $$  | $$    | $$      /$$$$$$$| $$      | $$$$$$/       |  $$$$$$ | $$  | $$| $$      | $$$$$$$$|  $$$$$$|  $$$$$$ | $$_/   | $$  | $$| $$\n" +
            "| $$  | $$  | $$ /$$| $$ /$$ /$$__  $$| $$      | $$_  $$        \\____  $$| $$  | $$| $$      | $$_____/ \\____  $$\\____  $$| $$     | $$  | $$| $$\n" +
            "| $$  | $$  |  $$$$/|  $$$$/|  $$$$$$$|  $$$$$$$| $$ \\  $$       /$$$$$$$/|  $$$$$$/|  $$$$$$$|  $$$$$$$ /$$$$$$$//$$$$$$$/| $$     |  $$$$$$/| $$\n" +
            "|__/  |__/   \\___/   \\___/   \\_______/ \\_______/|__/  \\__/      |_______/  \\______/  \\_______/ \\_______/|_______/|_______/ |__/      \\______/ |__/\n" +
            "                                                                                                                                                  \n" +
            "                                                                                                                                                  "
            +Assets.whiteTerminal
            ;
    static String rustedBlow =
            Assets.yellowTerminal +
            " /$$$$$$$                        /$$                     /$$       /$$$$$$$  /$$                        \n" +
            "| $$__  $$                      | $$                    | $$      | $$__  $$| $$                        \n" +
            "| $$  \\ $$ /$$   /$$  /$$$$$$$ /$$$$$$    /$$$$$$   /$$$$$$$      | $$  \\ $$| $$  /$$$$$$  /$$  /$$  /$$\n" +
            "| $$$$$$$/| $$  | $$ /$$_____/|_  $$_/   /$$__  $$ /$$__  $$      | $$$$$$$ | $$ /$$__  $$| $$ | $$ | $$\n" +
            "| $$__  $$| $$  | $$|  $$$$$$   | $$    | $$$$$$$$| $$  | $$      | $$__  $$| $$| $$  \\ $$| $$ | $$ | $$\n" +
            "| $$  \\ $$| $$  | $$ \\____  $$  | $$ /$$| $$_____/| $$  | $$      | $$  \\ $$| $$| $$  | $$| $$ | $$ | $$\n" +
            "| $$  | $$|  $$$$$$/ /$$$$$$$/  |  $$$$/|  $$$$$$$|  $$$$$$$      | $$$$$$$/| $$|  $$$$$$/|  $$$$$/$$$$/\n" +
            "|__/  |__/ \\______/ |_______/    \\___/   \\_______/ \\_______/      |_______/ |__/ \\______/  \\_____/\\___/ \n" +
            "                                                                                                        \n" +
            "                                                                                                        "
            + Assets.whiteTerminal
            ;
    static String fireBreath =
            " /$$$$$$$$ /$$                           /$$$$$$$                                  /$$     /$$      \n" +
                    "| $$_____/|__/                          | $$__  $$                                | $$    | $$      \n" +
                    "| $$       /$$  /$$$$$$   /$$$$$$       | $$  \\ $$  /$$$$$$   /$$$$$$   /$$$$$$  /$$$$$$  | $$$$$$$ \n" +
                    "| $$$$$   | $$ /$$__  $$ /$$__  $$      | $$$$$$$  /$$__  $$ /$$__  $$ |____  $$|_  $$_/  | $$__  $$\n" +
                    "| $$__/   | $$| $$  \\__/| $$$$$$$$      | $$__  $$| $$  \\__/| $$$$$$$$  /$$$$$$$  | $$    | $$  \\ $$\n" +
                    "| $$      | $$| $$      | $$_____/      | $$  \\ $$| $$      | $$_____/ /$$__  $$  | $$ /$$| $$  | $$\n" +
                    "| $$      | $$| $$      |  $$$$$$$      | $$$$$$$/| $$      |  $$$$$$$|  $$$$$$$  |  $$$$/| $$  | $$\n" +
                    "|__/      |__/|__/       \\_______/      |_______/ |__/       \\_______/ \\_______/   \\___/  |__/  |__/\n" +
                    "                                                                                                    \n" +
                    "                                                                                                    ";

    static String sword = "                                                    &&\n" +
            "                                                    &&\n" +
            " ______________________________________,___________&&&&              &\n" +
            "/__________________________________________________&@@@@@@@@@@@@@@@@&&}\n" +
            "\\______________________________________ ___________&@@@@@@@@@@@@@@@@&&}\n" +
            "                                       `           &&&&              &\n" +
            "                                                    &&\n" +
            "                                                    &&";
    static String flames =
            "               (  .      )\n" +
                    "           )           (              )\n" +
                    "                 .  '   .   '  .  '  .\n" +
                    "        (    , )       (.   )  (   ',    )\n" +
                    "         .' ) ( . )    ,  ( ,     )   ( .\n" +
                    "      ). , ( .   (  ) ( , ')  .' (  ,    )\n" +
                    "     (_,) . ), ) _) _,')  (, ) '. )  ,. (' )\n" +
                    " ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^";

    static String enemyHealthPrompt = " /$$$$$$$$                                                   /$$   /$$                     /$$   /$$     /$$      \n" +
            "| $$_____/                                                  | $$  | $$                    | $$  | $$    | $$      \n" +
            "| $$       /$$$$$$$   /$$$$$$  /$$$$$$/$$$$  /$$   /$$      | $$  | $$  /$$$$$$   /$$$$$$ | $$ /$$$$$$  | $$$$$$$ \n" +
            "| $$$$$   | $$__  $$ /$$__  $$| $$_  $$_  $$| $$  | $$      | $$$$$$$$ /$$__  $$ |____  $$| $$|_  $$_/  | $$__  $$\n" +
            "| $$__/   | $$  \\ $$| $$$$$$$$| $$ \\ $$ \\ $$| $$  | $$      | $$__  $$| $$$$$$$$  /$$$$$$$| $$  | $$    | $$  \\ $$\n" +
            "| $$      | $$  | $$| $$_____/| $$ | $$ | $$| $$  | $$      | $$  | $$| $$_____/ /$$__  $$| $$  | $$ /$$| $$  | $$\n" +
            "| $$$$$$$$| $$  | $$|  $$$$$$$| $$ | $$ | $$|  $$$$$$$      | $$  | $$|  $$$$$$$|  $$$$$$$| $$  |  $$$$/| $$  | $$\n" +
            "|________/|__/  |__/ \\_______/|__/ |__/ |__/ \\____  $$      |__/  |__/ \\_______/ \\_______/|__/   \\___/  |__/  |__/\n" +
            "                                             /$$  | $$                                                            \n" +
            "                                            |  $$$$$$/                                                            \n" +
            "                                             \\______/                                                             ";

    static String playerHealthPrompt =
            " /$$$$$$$  /$$                                               /$$   /$$                     /$$   /$$     /$$      \n" +
            "| $$__  $$| $$                                              | $$  | $$                    | $$  | $$    | $$      \n" +
            "| $$  \\ $$| $$  /$$$$$$  /$$   /$$  /$$$$$$   /$$$$$$       | $$  | $$  /$$$$$$   /$$$$$$ | $$ /$$$$$$  | $$$$$$$ \n" +
            "| $$$$$$$/| $$ |____  $$| $$  | $$ /$$__  $$ /$$__  $$      | $$$$$$$$ /$$__  $$ |____  $$| $$|_  $$_/  | $$__  $$\n" +
            "| $$____/ | $$  /$$$$$$$| $$  | $$| $$$$$$$$| $$  \\__/      | $$__  $$| $$$$$$$$  /$$$$$$$| $$  | $$    | $$  \\ $$\n" +
            "| $$      | $$ /$$__  $$| $$  | $$| $$_____/| $$            | $$  | $$| $$_____/ /$$__  $$| $$  | $$ /$$| $$  | $$\n" +
            "| $$      | $$|  $$$$$$$|  $$$$$$$|  $$$$$$$| $$            | $$  | $$|  $$$$$$$|  $$$$$$$| $$  |  $$$$/| $$  | $$\n" +
            "|__/      |__/ \\_______/ \\____  $$ \\_______/|__/            |__/  |__/ \\_______/ \\_______/|__/   \\___/  |__/  |__/\n" +
            "                         /$$  | $$                                                                                \n" +
            "                        |  $$$$$$/                                                                                \n" +
            "                         \\______/                                                                                 ";


    static String negative100 =
            Assets.redTerminal +
            "         /$$    /$$$$$$   /$$$$$$ \n" +
            "       /$$$$   /$$$_  $$ /$$$_  $$\n" +
            "      |_  $$  | $$$$\\ $$| $$$$\\ $$\n" +
            " /$$$$$$| $$  | $$ $$ $$| $$ $$ $$\n" +
            "|______/| $$  | $$\\ $$$$| $$\\ $$$$\n" +
            "        | $$  | $$ \\ $$$| $$ \\ $$$\n" +
            "       /$$$$$$|  $$$$$$/|  $$$$$$/\n" +
            "      |______/ \\______/  \\______/ "
                    +Assets.whiteTerminal;

static String negative10 =
        Assets.redTerminal +
        "         /$$    /$$$$$$ \n" +
        "       /$$$$   /$$$_  $$\n" +
        "      |_  $$  | $$$$\\ $$\n" +
        " /$$$$$$| $$  | $$ $$ $$\n" +
        "|______/| $$  | $$\\ $$$$\n" +
        "        | $$  | $$ \\ $$$\n" +
        "       /$$$$$$|  $$$$$$/\n" +
        "      |______/ \\______/ "
                +Assets.whiteTerminal;

static String negative20 =
        Assets.redTerminal +
        "         /$$$$$$   /$$$$$$ \n" +
        "        /$$__  $$ /$$$_  $$\n" +
        "       |__/  \\ $$| $$$$\\ $$\n" +
        " /$$$$$$ /$$$$$$/| $$ $$ $$\n" +
        "|______//$$____/ | $$\\ $$$$\n" +
        "       | $$      | $$ \\ $$$\n" +
        "       | $$$$$$$$|  $$$$$$/\n" +
        "       |________/ \\______/ "
                +Assets.whiteTerminal;
static String negative30 =
        Assets.redTerminal +
        "        /$$$$$$   /$$$$$$ \n" +
        "       /$$__  $$ /$$$_  $$\n" +
        "      |__/  \\ $$| $$$$\\ $$\n" +
        " /$$$$$$ /$$$$$/| $$ $$ $$\n" +
        "|______/|___  $$| $$\\ $$$$\n" +
        "       /$$  \\ $$| $$ \\ $$$\n" +
        "      |  $$$$$$/|  $$$$$$/\n" +
        "       \\______/  \\______/ "
        +Assets.whiteTerminal;

static String negative40 =
        Assets.redTerminal +
        "         /$$   /$$  /$$$$$$ \n" +
        "        | $$  | $$ /$$$_  $$\n" +
        "        | $$  | $$| $$$$\\ $$\n" +
        " /$$$$$$| $$$$$$$$| $$ $$ $$\n" +
        "|______/|_____  $$| $$\\ $$$$\n" +
        "              | $$| $$ \\ $$$\n" +
        "              | $$|  $$$$$$/\n" +
        "              |__/ \\______/ "
                +Assets.whiteTerminal;
    static String negative70 =
            Assets.redTerminal +
                    "      /$$$$$$$$ /$$$$$$ \n" +
                    "     |_____ $$//$$$_  $$\n" +
                    "          /$$/| $$$$\\ $$\n" +
                    " /$$$$$$ /$$/ | $$ $$ $$\n" +
                    "|______//$$/  | $$\\ $$$$\n" +
                    "       /$$/   | $$ \\ $$$\n" +
                    "      /$$/    |  $$$$$$/\n" +
                    "     |__/      \\______/ \n" +
                    "                        \n" +
                    "                        "
                    +Assets.whiteTerminal;
static String usedItem =
        " /$$   /$$                           /$$       /$$$$$$ /$$                            \n" +
        "| $$  | $$                          | $$      |_  $$_/| $$                            \n" +
        "| $$  | $$  /$$$$$$$  /$$$$$$   /$$$$$$$        | $$ /$$$$$$    /$$$$$$  /$$$$$$/$$$$ \n" +
        "| $$  | $$ /$$_____/ /$$__  $$ /$$__  $$        | $$|_  $$_/   /$$__  $$| $$_  $$_  $$\n" +
        "| $$  | $$|  $$$$$$ | $$$$$$$$| $$  | $$        | $$  | $$    | $$$$$$$$| $$ \\ $$ \\ $$\n" +
        "| $$  | $$ \\____  $$| $$_____/| $$  | $$        | $$  | $$ /$$| $$_____/| $$ | $$ | $$\n" +
        "|  $$$$$$/ /$$$$$$$/|  $$$$$$$|  $$$$$$$       /$$$$$$|  $$$$/|  $$$$$$$| $$ | $$ | $$\n" +
        " \\______/ |_______/  \\_______/ \\_______/      |______/ \\___/   \\_______/|__/ |__/ |__/\n" +
        "                                                                                      \n" +
        "                                                                                      ";

static String playerDefeated =
        Assets.redTerminal+
        " ██▓███   ██▓    ▄▄▄     ▓██   ██▓▓█████  ██▀███     ▓█████▄ ▓█████   █████▒▓█████ ▄▄▄     ▄▄▄█████▓▓█████ ▓█████▄ \n" +
        "▓██░  ██▒▓██▒   ▒████▄    ▒██  ██▒▓█   ▀ ▓██ ▒ ██▒   ▒██▀ ██▌▓█   ▀ ▓██   ▒ ▓█   ▀▒████▄   ▓  ██▒ ▓▒▓█   ▀ ▒██▀ ██▌\n" +
        "▓██░ ██▓▒▒██░   ▒██  ▀█▄   ▒██ ██░▒███   ▓██ ░▄█ ▒   ░██   █▌▒███   ▒████ ░ ▒███  ▒██  ▀█▄ ▒ ▓██░ ▒░▒███   ░██   █▌\n" +
        "▒██▄█▓▒ ▒▒██░   ░██▄▄▄▄██  ░ ▐██▓░▒▓█  ▄ ▒██▀▀█▄     ░▓█▄   ▌▒▓█  ▄ ░▓█▒  ░ ▒▓█  ▄░██▄▄▄▄██░ ▓██▓ ░ ▒▓█  ▄ ░▓█▄   ▌\n" +
        "▒██▒ ░  ░░██████▒▓█   ▓██▒ ░ ██▒▓░░▒████▒░██▓ ▒██▒   ░▒████▓ ░▒████▒░▒█░    ░▒████▒▓█   ▓██▒ ▒██▒ ░ ░▒████▒░▒████▓ \n" +
        "▒▓▒░ ░  ░░ ▒░▓  ░▒▒   ▓▒█░  ██▒▒▒ ░░ ▒░ ░░ ▒▓ ░▒▓░    ▒▒▓  ▒ ░░ ▒░ ░ ▒ ░    ░░ ▒░ ░▒▒   ▓▒█░ ▒ ░░   ░░ ▒░ ░ ▒▒▓  ▒ \n" +
        "░▒ ░     ░ ░ ▒  ░ ▒   ▒▒ ░▓██ ░▒░  ░ ░  ░  ░▒ ░ ▒░    ░ ▒  ▒  ░ ░  ░ ░       ░ ░  ░ ▒   ▒▒ ░   ░     ░ ░  ░ ░ ▒  ▒ \n" +
        "░░         ░ ░    ░   ▒   ▒ ▒ ░░     ░     ░░   ░     ░ ░  ░    ░    ░ ░       ░    ░   ▒    ░         ░    ░ ░  ░ \n" +
        "             ░  ░     ░  ░░ ░        ░  ░   ░           ░       ░  ░           ░  ░     ░  ░           ░  ░   ░    \n" +
        "                          ░ ░                         ░                                                     ░      "
                +Assets.whiteTerminal;
static String enemyDefeated =
        Assets.greenTerminal+
        "   ▄████████ ███▄▄▄▄      ▄████████   ▄▄▄▄███▄▄▄▄   ▄██   ▄        ████████▄     ▄████████    ▄████████    ▄████████    ▄████████     ███        ▄████████ ████████▄  \n" +
        "  ███    ███ ███▀▀▀██▄   ███    ███ ▄██▀▀▀███▀▀▀██▄ ███   ██▄      ███   ▀███   ███    ███   ███    ███   ███    ███   ███    ███ ▀█████████▄   ███    ███ ███   ▀███ \n" +
        "  ███    █▀  ███   ███   ███    █▀  ███   ███   ███ ███▄▄▄███      ███    ███   ███    █▀    ███    █▀    ███    █▀    ███    ███    ▀███▀▀██   ███    █▀  ███    ███ \n" +
        " ▄███▄▄▄     ███   ███  ▄███▄▄▄     ███   ███   ███ ▀▀▀▀▀▀███      ███    ███  ▄███▄▄▄      ▄███▄▄▄      ▄███▄▄▄       ███    ███     ███   ▀  ▄███▄▄▄     ███    ███ \n" +
        "▀▀███▀▀▀     ███   ███ ▀▀███▀▀▀     ███   ███   ███ ▄██   ███      ███    ███ ▀▀███▀▀▀     ▀▀███▀▀▀     ▀▀███▀▀▀     ▀███████████     ███     ▀▀███▀▀▀     ███    ███ \n" +
        "  ███    █▄  ███   ███   ███    █▄  ███   ███   ███ ███   ███      ███    ███   ███    █▄    ███          ███    █▄    ███    ███     ███       ███    █▄  ███    ███ \n" +
        "  ███    ███ ███   ███   ███    ███ ███   ███   ███ ███   ███      ███   ▄███   ███    ███   ███          ███    ███   ███    ███     ███       ███    ███ ███   ▄███ \n" +
        "  ██████████  ▀█   █▀    ██████████  ▀█   ███   █▀   ▀█████▀       ████████▀    ██████████   ███          ██████████   ███    █▀     ▄████▀     ██████████ ████████▀  ";

public static void drawSucessfulAttack(){
        System.out.println(successfulAttack);
    }
    public static void drawFailedAttack(){
        System.out.println(failedAttack);
    }

    public static void drawRustedBlow(){
        System.out.println(rustedBlow);
    }

    public static void drawFireBreath(){
        System.out.println(fireBreath);
    }

    public static void drawFlames(){
        System.out.println(flames);
    }

    public static void drawSword(){
        System.out.println(sword);
    }

    public static void drawEnemyHealthPrompt(){
        System.out.println(enemyHealthPrompt);
    }

    public static void drawPlayerHealthPrompt(){
        System.out.println(playerHealthPrompt);
    }

    public static void drawNumber(int num){
        switch (num){
            case -10:
                System.out.println(negative10);
                break;
            case -20:
                System.out.println(negative20);
                break;
            case -30:
                System.out.println(negative30);
                break;
            case -40:
                System.out.println(negative40);
                break;
            case -70:
                System.out.println(negative70);
                break;
            case -100:
                System.out.println(negative100);
                break;
            default:
                break;

        }
    }

    public static void drawEnemyDefeated(){
        System.out.println(enemyDefeated);
    }

    public static void drawPlayerDefeated(){
        System.out.println(playerDefeated);
    }

    public static void sidePrint(String object1, String object2, String object3, int lines) {
        String[] col1 = object1.split("\\r?\\n");
        String[] col2 = object2.split("\\r?\\n");
        String[] col3 = object3.split("\\r?\\n");

        int longestLine = 0;

        int currentLine = 0;


        if (col1.length > col2.length) {
            longestLine = col1.length;
        }
        if (col2.length >= col1.length) {
            longestLine = col2.length;
        }
        if (col1.length >= col3.length) {
            longestLine = col1.length;
        }
        if (col3.length >= col1.length) {
            longestLine = col3.length;
        }

        if (col2.length >= col3.length) {
            longestLine = col2.length;
        }

        for (int i = 0; i < longestLine; i++) {
            String combined = "";
            if (i <= col1.length - 1) {
                combined += normalizeLines(col1[i],lines);

            }
            if (i <= col2.length - 1) {

                combined += normalizeLines(col2[i],lines);
            }
            if (i <= col3.length - 1) {

                combined += normalizeLines(col3[i],lines);

            }
            System.out.println(combined);
        }
    }


    public static void sidePrint(String object1, String object2, String object3, int lines,String colorCol1, String colorCol2, String colorCol3) {
        String[] col1 = object1.split("\\r?\\n");
        String[] col2 = object2.split("\\r?\\n");
        String[] col3 = object3.split("\\r?\\n");

        int longestLine = 0;

        int currentLine = 0;


        if (col2.length >= col3.length) {
            longestLine = col2.length;
        }

        if (col1.length >= col2.length) {
            longestLine = col1.length;
        }
        if (col2.length >= col1.length) {
            longestLine = col2.length;
        }
        if (col1.length >= col3.length) {
            longestLine = col1.length;
        }
        if (col3.length >= col1.length) {
            longestLine = col3.length;
        }

        for (int i = 0; i < longestLine; i++) {
            String combined = "";
            if (i <= col1.length - 1 ) {

                combined += colorCol1 + normalizeLines(col1[i],longestLine+lines) + Assets.whiteTerminal;

            }
            if (i <= col2.length - 1) {

                combined += colorCol2 + normalizeLines(col2[i],longestLine+lines) + Assets.whiteTerminal;
            }
            if (i <= col3.length - 1) {

                combined += colorCol3 + normalizeLines(col3[i],longestLine+lines) + Assets.whiteTerminal;

            }
            System.out.println(combined );
        }
    }

    public static String sideString(String object1, String object2, String object3, int lines,String colorCol1, String colorCol2, String colorCol3) {
        String[] col1 = object1.split("\\r?\\n");
        String[] col2 = object2.split("\\r?\\n");
        String[] col3 = object3.split("\\r?\\n");


        int longestLine =0;
        int longestLineCol1 = 0;
        int longestLineCol2 = 0;
        int longestLineCol3 = 0;

        int currentLine = 0;

        for(String line : col1){
            if(line.length() > longestLineCol1){
                longestLineCol1 = line.length();
            }
        }
        for(String line : col2){
            if(line.length() > longestLineCol2){
                longestLineCol2 = line.length();
            }
        }
        for(String line : col3){
            if(line.length() > longestLineCol3){
                longestLineCol3 = line.length();
            }
        }




        if (col2.length >= col3.length) {
            longestLine = col2.length;
        }

        if (col1.length >= col2.length) {
            longestLine = col1.length;
        }
        if (col2.length >= col1.length) {
            longestLine = col2.length;
        }
        if (col1.length >= col3.length) {
            longestLine = col1.length;
        }
        if (col3.length >= col1.length) {
            longestLine = col3.length;
        }
    String superCombined ="";
        for (int i = 0; i < longestLine; i++) {
            String combined = "";
            if (i <= col1.length - 1) {
                combined += colorCol1 + normalizeLines(col1[i],longestLineCol1+lines);

            }
            if (i <= col2.length - 1) {

                combined += colorCol2 + normalizeLines(col2[i],longestLineCol2+lines);
            }
            if (i <= col3.length - 1) {

                combined += colorCol3 + normalizeLines(col3[i],longestLineCol3+lines);

            }
            superCombined += combined + Assets.whiteTerminal + "\n";
        }
        return superCombined;
    }

    public static String normalizeLines(String line, int lineCount){
        int offset = 0;

        for(String e: Assets.allColors){
            if(line.contains(e)){
                offset = e.length();
            }
        }


        while (line.length() - offset < lineCount){
            line += " ";
        }
        return line;
    }


    public static String boxer(String text){
    String[] lines = text.split("\\r?\\n");

    String newString = "";

    int lineLength = maxLineLength(text);

    for(int i = 0; i < lineLength+2;i++){
        newString += "x";
    }
    newString += "\n";

    for (int i = 0; i < lines.length;i++){
        newString += "x" + normalizeLines(lines[i],lineLength) + "x";
        newString += "\n";
    }

    for(int i = 0; i < lineLength+2;i++){
            newString += "x";
        }



return newString;
    }

    public static int maxLineLength(String text){
        String[] lines = text.split("\\r?\\n");
        int maxLine = 0;



        for (int i =0; i < lines.length; i++){
            if(lines[i].length() > maxLine){
                maxLine = lines[i].length();
            }
        }
        return maxLine;
    }

    public void drawInventory(){

    }

    public static String stringMoveMenu(Character character ){
        ArrayList<Attack> moves = character.getAttacks();
        String newString = "";



        for(Attack a: moves){
            String attackInfo = a.getAttackName() + "\n" + "Damage: " + a.getAttackDamage()+ "\n" + "Stamina used: " + a.getAttackStamina() + "\n" + "Attack type" + a.getType();
            newString += Messages.sideString(a.getAttackPicture(),attackInfo,"",5,Assets.brightRedTerminal,Assets.blueTerminal,Assets.whiteTerminal);
            newString += "\n";

            newString += Assets.whiteTerminal + a.getSpecialEffectDesc();
            newString += "\n";
        }



        newString = boxer(newString);
        return newString;
    }

    public static String effectPrint(String effectName){
        String newString = "";
        switch (effectName.toLowerCase()){
            case "rust":
                newString = sideString(textRust,textActive,"",10,Assets.magentaTerminal,Assets.magentaTerminal,Assets.whiteTerminal);
                return newString;
            default:
                return "";
        }
    }

    public static void drawAttack(String attackName){
        switch (attackName){
            case "rusted blow":
                Messages.drawRustedBlow();
                Messages.drawSword();
                break;
            case "fire breath":
                Messages.drawFireBreath();
                Messages.drawFlames();
        }
    }

    public static void drawUsedItem(String itemName){
        switch (itemName){
            case "small health potion":
                sidePrint(small,health,potion,10,Assets.blueTerminal,Assets.blueTerminal,Assets.blueTerminal);
                break;
        }
    }

}
