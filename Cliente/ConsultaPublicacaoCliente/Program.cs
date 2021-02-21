using UmAutorService;
using System;
using System.Linq;
using System.Threading.Tasks;

namespace ConsultaPublicacaoCliente
{
    class Program
    {
        /// <summary>
        /// O método abaixo consome o WSDL: http://5064-nb:8080/UmAutor/PesquisaPublicacao?wsdl
        /// </summary>
        /// <param name="args"></param>
        /// <returns></returns>
        static async Task Main(string[] args)
        {
            var pesquisaPublicacao = new PesquisaPublicacaoClient();

            var responseCoraline = await pesquisaPublicacao.retornaPublicacaoAsync("Researchops");
            Console.WriteLine("Consulta ao web service passando como argumento a string: 'Researchops'");
            Console.WriteLine("Resultado:");
            Console.WriteLine(responseCoraline.@return.First());
            Console.WriteLine("");
            Console.WriteLine("");


            var responseDestruction = await pesquisaPublicacao.retornaPublicacaoAsync("Analysis of tools for rest contract specification in swagger");
            Console.WriteLine("Consulta ao web service passando como argumento a string: 'Analysis of tools for rest contract specification in swagger'");
            Console.WriteLine("");
            Console.WriteLine("Resultado:");
            Console.WriteLine(responseDestruction.@return.First());
            Console.WriteLine("");
            Console.WriteLine("");

            Console.ReadLine();
        }     
       
    }
}