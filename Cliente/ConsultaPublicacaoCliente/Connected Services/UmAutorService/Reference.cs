﻿//------------------------------------------------------------------------------
// <auto-generated>
//     This code was generated by a tool.
//
//     Changes to this file may cause incorrect behavior and will be lost if
//     the code is regenerated.
// </auto-generated>
//------------------------------------------------------------------------------

using Newtonsoft.Json;

namespace UmAutorService
{
    
    
    [System.CodeDom.Compiler.GeneratedCodeAttribute("Microsoft.Tools.ServiceModel.Svcutil", "2.0.2")]
    [System.ServiceModel.ServiceContractAttribute(Namespace="http://umautor.mycompany.com/", ConfigurationName="UmAutorService.PesquisaPublicacao")]
    public interface PesquisaPublicacao
    {
        
        [System.ServiceModel.OperationContractAttribute(Action="http://umautor.mycompany.com/PesquisaPublicacao/retornaPublicacaoRequest", ReplyAction="http://umautor.mycompany.com/PesquisaPublicacao/retornaPublicacaoResponse")]
        [System.ServiceModel.XmlSerializerFormatAttribute(SupportFaults=true)]
        System.Threading.Tasks.Task<UmAutorService.retornaPublicacaoResponse> retornaPublicacaoAsync(UmAutorService.retornaPublicacaoRequest request);
    }
    
    /// <remarks/>
    [System.CodeDom.Compiler.GeneratedCodeAttribute("Microsoft.Tools.ServiceModel.Svcutil", "2.0.2")]
    [System.Diagnostics.DebuggerStepThroughAttribute()]
    [System.Xml.Serialization.XmlTypeAttribute(Namespace="http://umautor.mycompany.com/")]
    public partial class publicacao
    {
        
        private int anoPublicacaoField;
        
        private autor[] autoresField;
        
        private int idField;
        
        private int paginaFinalField;
        
        private int paginaInicialField;
        
        private string tituloField;
        
        /// <remarks/>
        [System.Xml.Serialization.XmlElementAttribute(Form=System.Xml.Schema.XmlSchemaForm.Unqualified, Order=0)]
        public int anoPublicacao
        {
            get
            {
                return this.anoPublicacaoField;
            }
            set
            {
                this.anoPublicacaoField = value;
            }
        }
        
        /// <remarks/>
        [System.Xml.Serialization.XmlElementAttribute("autores", Form=System.Xml.Schema.XmlSchemaForm.Unqualified, IsNullable=true, Order=1)]
        public autor[] autores
        {
            get
            {
                return this.autoresField;
            }
            set
            {
                this.autoresField = value;
            }
        }
        
        /// <remarks/>
        [System.Xml.Serialization.XmlElementAttribute(Form=System.Xml.Schema.XmlSchemaForm.Unqualified, Order=2)]
        public int id
        {
            get
            {
                return this.idField;
            }
            set
            {
                this.idField = value;
            }
        }
        
        /// <remarks/>
        [System.Xml.Serialization.XmlElementAttribute(Form=System.Xml.Schema.XmlSchemaForm.Unqualified, Order=3)]
        public int paginaFinal
        {
            get
            {
                return this.paginaFinalField;
            }
            set
            {
                this.paginaFinalField = value;
            }
        }
        
        /// <remarks/>
        [System.Xml.Serialization.XmlElementAttribute(Form=System.Xml.Schema.XmlSchemaForm.Unqualified, Order=4)]
        public int paginaInicial
        {
            get
            {
                return this.paginaInicialField;
            }
            set
            {
                this.paginaInicialField = value;
            }
        }
        
        /// <remarks/>
        [System.Xml.Serialization.XmlElementAttribute(Form=System.Xml.Schema.XmlSchemaForm.Unqualified, Order=5)]
        public string titulo
        {
            get
            {
                return this.tituloField;
            }
            set
            {
                this.tituloField = value;
            }
        }

        public override string ToString()
        {
            return JsonConvert.SerializeObject(this, Formatting.Indented);
        }
    }
    
    /// <remarks/>
    [System.CodeDom.Compiler.GeneratedCodeAttribute("Microsoft.Tools.ServiceModel.Svcutil", "2.0.2")]
    [System.Diagnostics.DebuggerStepThroughAttribute()]
    [System.Xml.Serialization.XmlTypeAttribute(Namespace="http://umautor.mycompany.com/")]
    public partial class autor
    {
        
        private string cpfField;
        
        private int idField;
        
        private string nomeField;
        
        /// <remarks/>
        [System.Xml.Serialization.XmlElementAttribute(Form=System.Xml.Schema.XmlSchemaForm.Unqualified, Order=0)]
        public string cpf
        {
            get
            {
                return this.cpfField;
            }
            set
            {
                this.cpfField = value;
            }
        }
        
        /// <remarks/>
        [System.Xml.Serialization.XmlElementAttribute(Form=System.Xml.Schema.XmlSchemaForm.Unqualified, Order=1)]
        public int id
        {
            get
            {
                return this.idField;
            }
            set
            {
                this.idField = value;
            }
        }
        
        /// <remarks/>
        [System.Xml.Serialization.XmlElementAttribute(Form=System.Xml.Schema.XmlSchemaForm.Unqualified, Order=2)]
        public string nome
        {
            get
            {
                return this.nomeField;
            }
            set
            {
                this.nomeField = value;
            }
        }
    }
    
    [System.Diagnostics.DebuggerStepThroughAttribute()]
    [System.CodeDom.Compiler.GeneratedCodeAttribute("Microsoft.Tools.ServiceModel.Svcutil", "2.0.2")]
    [System.ComponentModel.EditorBrowsableAttribute(System.ComponentModel.EditorBrowsableState.Advanced)]
    [System.ServiceModel.MessageContractAttribute(WrapperName="retornaPublicacao", WrapperNamespace="http://umautor.mycompany.com/", IsWrapped=true)]
    public partial class retornaPublicacaoRequest
    {
        
        [System.ServiceModel.MessageBodyMemberAttribute(Namespace="http://umautor.mycompany.com/", Order=0)]
        [System.Xml.Serialization.XmlElementAttribute(Form=System.Xml.Schema.XmlSchemaForm.Unqualified)]
        public string titulo;
        
        public retornaPublicacaoRequest()
        {
        }
        
        public retornaPublicacaoRequest(string titulo)
        {
            this.titulo = titulo;
        }
    }
    
    [System.Diagnostics.DebuggerStepThroughAttribute()]
    [System.CodeDom.Compiler.GeneratedCodeAttribute("Microsoft.Tools.ServiceModel.Svcutil", "2.0.2")]
    [System.ComponentModel.EditorBrowsableAttribute(System.ComponentModel.EditorBrowsableState.Advanced)]
    [System.ServiceModel.MessageContractAttribute(WrapperName="retornaPublicacaoResponse", WrapperNamespace="http://umautor.mycompany.com/", IsWrapped=true)]
    public partial class retornaPublicacaoResponse
    {
        
        [System.ServiceModel.MessageBodyMemberAttribute(Namespace="http://umautor.mycompany.com/", Order=0)]
        [System.Xml.Serialization.XmlElementAttribute("return", Form=System.Xml.Schema.XmlSchemaForm.Unqualified)]
        public UmAutorService.publicacao[] @return;
        
        public retornaPublicacaoResponse()
        {
        }
        
        public retornaPublicacaoResponse(UmAutorService.publicacao[] @return)
        {
            this.@return = @return;
        }
    }
    
    [System.CodeDom.Compiler.GeneratedCodeAttribute("Microsoft.Tools.ServiceModel.Svcutil", "2.0.2")]
    public interface PesquisaPublicacaoChannel : UmAutorService.PesquisaPublicacao, System.ServiceModel.IClientChannel
    {
    }
    
    [System.Diagnostics.DebuggerStepThroughAttribute()]
    [System.CodeDom.Compiler.GeneratedCodeAttribute("Microsoft.Tools.ServiceModel.Svcutil", "2.0.2")]
    public partial class PesquisaPublicacaoClient : System.ServiceModel.ClientBase<UmAutorService.PesquisaPublicacao>, UmAutorService.PesquisaPublicacao
    {
        
        /// <summary>
        /// Implement this partial method to configure the service endpoint.
        /// </summary>
        /// <param name="serviceEndpoint">The endpoint to configure</param>
        /// <param name="clientCredentials">The client credentials</param>
        static partial void ConfigureEndpoint(System.ServiceModel.Description.ServiceEndpoint serviceEndpoint, System.ServiceModel.Description.ClientCredentials clientCredentials);
        
        public PesquisaPublicacaoClient() : 
                base(PesquisaPublicacaoClient.GetDefaultBinding(), PesquisaPublicacaoClient.GetDefaultEndpointAddress())
        {
            this.Endpoint.Name = EndpointConfiguration.PesquisaPublicacaoPort.ToString();
            ConfigureEndpoint(this.Endpoint, this.ClientCredentials);
        }
        
        public PesquisaPublicacaoClient(EndpointConfiguration endpointConfiguration) : 
                base(PesquisaPublicacaoClient.GetBindingForEndpoint(endpointConfiguration), PesquisaPublicacaoClient.GetEndpointAddress(endpointConfiguration))
        {
            this.Endpoint.Name = endpointConfiguration.ToString();
            ConfigureEndpoint(this.Endpoint, this.ClientCredentials);
        }
        
        public PesquisaPublicacaoClient(EndpointConfiguration endpointConfiguration, string remoteAddress) : 
                base(PesquisaPublicacaoClient.GetBindingForEndpoint(endpointConfiguration), new System.ServiceModel.EndpointAddress(remoteAddress))
        {
            this.Endpoint.Name = endpointConfiguration.ToString();
            ConfigureEndpoint(this.Endpoint, this.ClientCredentials);
        }
        
        public PesquisaPublicacaoClient(EndpointConfiguration endpointConfiguration, System.ServiceModel.EndpointAddress remoteAddress) : 
                base(PesquisaPublicacaoClient.GetBindingForEndpoint(endpointConfiguration), remoteAddress)
        {
            this.Endpoint.Name = endpointConfiguration.ToString();
            ConfigureEndpoint(this.Endpoint, this.ClientCredentials);
        }
        
        public PesquisaPublicacaoClient(System.ServiceModel.Channels.Binding binding, System.ServiceModel.EndpointAddress remoteAddress) : 
                base(binding, remoteAddress)
        {
        }
        
        [System.ComponentModel.EditorBrowsableAttribute(System.ComponentModel.EditorBrowsableState.Advanced)]
        System.Threading.Tasks.Task<UmAutorService.retornaPublicacaoResponse> UmAutorService.PesquisaPublicacao.retornaPublicacaoAsync(UmAutorService.retornaPublicacaoRequest request)
        {
            return base.Channel.retornaPublicacaoAsync(request);
        }
        
        public System.Threading.Tasks.Task<UmAutorService.retornaPublicacaoResponse> retornaPublicacaoAsync(string titulo)
        {
            UmAutorService.retornaPublicacaoRequest inValue = new UmAutorService.retornaPublicacaoRequest();
            inValue.titulo = titulo;
            return ((UmAutorService.PesquisaPublicacao)(this)).retornaPublicacaoAsync(inValue);
        }
        
        public virtual System.Threading.Tasks.Task OpenAsync()
        {
            return System.Threading.Tasks.Task.Factory.FromAsync(((System.ServiceModel.ICommunicationObject)(this)).BeginOpen(null, null), new System.Action<System.IAsyncResult>(((System.ServiceModel.ICommunicationObject)(this)).EndOpen));
        }
        
        public virtual System.Threading.Tasks.Task CloseAsync()
        {
            return System.Threading.Tasks.Task.Factory.FromAsync(((System.ServiceModel.ICommunicationObject)(this)).BeginClose(null, null), new System.Action<System.IAsyncResult>(((System.ServiceModel.ICommunicationObject)(this)).EndClose));
        }
        
        private static System.ServiceModel.Channels.Binding GetBindingForEndpoint(EndpointConfiguration endpointConfiguration)
        {
            if ((endpointConfiguration == EndpointConfiguration.PesquisaPublicacaoPort))
            {
                System.ServiceModel.BasicHttpBinding result = new System.ServiceModel.BasicHttpBinding();
                result.MaxBufferSize = int.MaxValue;
                result.ReaderQuotas = System.Xml.XmlDictionaryReaderQuotas.Max;
                result.MaxReceivedMessageSize = int.MaxValue;
                result.AllowCookies = true;
                return result;
            }
            throw new System.InvalidOperationException(string.Format("Could not find endpoint with name \'{0}\'.", endpointConfiguration));
        }
        
        private static System.ServiceModel.EndpointAddress GetEndpointAddress(EndpointConfiguration endpointConfiguration)
        {
            if ((endpointConfiguration == EndpointConfiguration.PesquisaPublicacaoPort))
            {
                return new System.ServiceModel.EndpointAddress("http://5064-nb:8080/UmAutor/PesquisaPublicacao");
            }
            throw new System.InvalidOperationException(string.Format("Could not find endpoint with name \'{0}\'.", endpointConfiguration));
        }
        
        private static System.ServiceModel.Channels.Binding GetDefaultBinding()
        {
            return PesquisaPublicacaoClient.GetBindingForEndpoint(EndpointConfiguration.PesquisaPublicacaoPort);
        }
        
        private static System.ServiceModel.EndpointAddress GetDefaultEndpointAddress()
        {
            return PesquisaPublicacaoClient.GetEndpointAddress(EndpointConfiguration.PesquisaPublicacaoPort);
        }
        
        public enum EndpointConfiguration
        {
            
            PesquisaPublicacaoPort,
        }
    }
}
