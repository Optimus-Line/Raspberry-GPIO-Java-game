/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication7;

/**
 *
 * @author Admin
 */
public class ascii {
String[] Guerrero=
{"                         ",
"                         ",    
"                         ",    
"                         ",    
"           ,             ",
"       ,   |\\ ,__        ",  
"       |\\   \\/   `.      ",
"       \\ `-.:.     `\\    ",
"        `-.__ `\\=====|   ",
"           /=`'/   ^_\\   ",
"         .'   /\\   .=)   ",
"      .-'  .'|  '-(/_|   ",
"    .'  __(  \\  .'`      ",
"   /_.'`  `.  |`         ", 
"            \\ |          ", 
"             |/          "};
String[] Oscar=
{"          ,---------.\n ",
"          ||\"\"\"\"\"\"\"||\\=\n",
"          ||       ||\\\n",
"          |/-->&<--\\|\\\n",
"          |  (._.)  |\\\n",
"          |  ( @ )  |\\\n",
"          | /|`\"|\\ |\n",
"         //(_\\___/_)\\\\\\\n",
"         \\\\_()___()_//\\\n",
"          `+---I---+'\\\n",
"          |\\(_)|(_)/|\\\n",
"         _|j\"\"\"\"\"\"\"|j_\n",
"         | |_______| |\\\n",
"         |_|       |_|\\\n",
"                            ",
"                            "};
String[] Abraham=
{"      _      xxxx      _    \n",
"     /_;-.__ / _\\  _.-;_\\    \n",
"        `-._`'`_/'`.-'       \n",  
"            `\\   /`          \n",
"             |  /            \n",
"            /-.(             \n",
"            \\_._\\            \n",
"             \\ \\`;           \n",
"              > |/           \n",
"             / //            \n",
"             |//             \n", 
"             \\(\\             \n",
"              ``             \n",
"                             \n",
"                             \n",
"                             \n"} ;
String[] Magadan=
{" __       __          .--.             \n",
"(  \"\"--__(  \"\"-_    ,' .-.\\        *    \n",
" \"-_ __  \"\"--__ \"-_(  (^_^))      /     \n",
"    (  \"\"\"--___\"\"--__\" )-'(      /      \n",
"     \"-__      \"\"---/ ,(., )__o-/,      \n",
"         \"\"\"----___(.'.   /--\"--'       \n",
"                   (\"-_\"/(    /         \n",
"                    \\   \\ \\             \n",
"                     `.  \\ |            \n", 
"                       \\  \\/            \n",
"                       ||  \\            \n",
"                     ,-'/`. \\           \n", 
"                     ) /   ) \\          \n",
"                     |/    `-.\\         \n",
"                              `\\        \n",
"                                         \n"}; 
String[] German=
{"           d8888o8888b              ",
"            88888888888            \n",
"           d88888888888b           \n",
"   `-..____HHHHHHHHHHHHH____.,-'   \n",    
"           /___, : .___\\           \n",
"          _) >=-( )-=< (_          \n",
"         ( (    / \\    ) )         \n",
"          \\_\\  ((_))  /_/          \n",
"            |)/  :  \\(|            \n",
"            |(,-----.)|            \n",
"            \\   '\"`   /            \n",
"            |`---\"---'|            \n",
"            |   `-'   |            \n",
"                                   \n",
"                                   \n",
"                                   \n"};       
String[] GigaProfe=
{"              a8888b.         \n",
"             d888888b.         \n", 
"             8P\"YP\"Y88         \n", 
"             8|o||o|88         \n", 
"             8'    .88         \n",
"             8`._.' Y8.        \n", 
"            d/      `8b.       \n",
"           dP   .    Y8b.      \n",
"          d8:'  \"  `::88b      \n",
"         d8\"         'Y88b     \n", 
"        :8P    '      :888     \n", 
"         8a.   :     _a88P     \n",
"       ._/\"Yaa_:   .| 88P|     \n",
"       \\    YP\"    `| 8P  `.   \n", 
"  a:f  /     \\.___.d|    .'    \n",
"       `--..__)8888P`._.'      \n",  };
String[] Profe=
{"           #####                 \n",
"          #### _\\_  ________     \n",
"          ##=-[.].]| \\      \\    \n",
"          #(    _\\ |  |------|   \n",
"           #   __| |  ||||||||   \n",
"            \\  _/  |  ||||||||   \n",
"         .--'--'-. |  | ____ |   \n",
"        / __      `|__|[o__o]|   \n",
"      _(____nm_______ /____\\____ \n",    
"                           \n",
"                           \n",
"                           \n",
"                           \n",
"                           \n",
"                           \n",
"                           \n",};

public String retString(int numenem){
  String result= "";
  switch(numenem){
      case 0:
          result= ordString(Oscar);
          break;
      case 1:
          result= ordString(Abraham);
          break;
      case 2:
          result= ordString(German);
          break;
      case 3:
          result= ordString(Magadan);
          break;
      case 4:
          result= ordString(Profe);
          break;
      case 5:
          result= ordString(GigaProfe);
          break;    
  }
  return result;  
}

private String ordString(String[] asci){
 String result="";
 for(int i=0;i<16;i++)
 {
     result+=Guerrero[i]+asci[i];
 }
 return result;   
}
}