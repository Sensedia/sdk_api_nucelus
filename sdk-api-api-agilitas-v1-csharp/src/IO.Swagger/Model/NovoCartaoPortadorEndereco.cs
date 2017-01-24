/* 
 * API Agillitas Cartões Pré-pagos
 *
 * API para manipular recursos relacionadas à cartões pré-pagos Agillitas.
 *
 * OpenAPI spec version: 1.0
 * 
 * Generated by: https://github.com/swagger-api/swagger-codegen.git
 */

using System;
using System.Linq;
using System.IO;
using System.Text;
using System.Text.RegularExpressions;
using System.Collections;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Runtime.Serialization;
using Newtonsoft.Json;
using Newtonsoft.Json.Converters;
using System.ComponentModel.DataAnnotations;

namespace IO.Swagger.Model
{
    /// <summary>
    /// NovoCartaoPortadorEndereco
    /// </summary>
    [DataContract]
    public partial class NovoCartaoPortadorEndereco :  IEquatable<NovoCartaoPortadorEndereco>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="NovoCartaoPortadorEndereco" /> class.
        /// </summary>
        /// <param name="Logradouro">Nome endereço do portador do cartão..</param>
        /// <param name="Complemento">Complemento do logradouro do portador do cartão..</param>
        /// <param name="Cidade">Nome cidade do portador do cartão..</param>
        /// <param name="Estado">Sigla do estado do portador do cartão..</param>
        /// <param name="Pais">Nome do pais do portador do cartão..</param>
        /// <param name="CodigoPostal">Código de endereçamento postal do portador do cartão..</param>
        public NovoCartaoPortadorEndereco(string Logradouro = default(string), string Complemento = default(string), string Cidade = default(string), string Estado = default(string), string Pais = default(string), string CodigoPostal = default(string))
        {
            this.Logradouro = Logradouro;
            this.Complemento = Complemento;
            this.Cidade = Cidade;
            this.Estado = Estado;
            this.Pais = Pais;
            this.CodigoPostal = CodigoPostal;
        }
        
        /// <summary>
        /// Nome endereço do portador do cartão.
        /// </summary>
        /// <value>Nome endereço do portador do cartão.</value>
        [DataMember(Name="logradouro", EmitDefaultValue=false)]
        public string Logradouro { get; set; }
        /// <summary>
        /// Complemento do logradouro do portador do cartão.
        /// </summary>
        /// <value>Complemento do logradouro do portador do cartão.</value>
        [DataMember(Name="complemento", EmitDefaultValue=false)]
        public string Complemento { get; set; }
        /// <summary>
        /// Nome cidade do portador do cartão.
        /// </summary>
        /// <value>Nome cidade do portador do cartão.</value>
        [DataMember(Name="cidade", EmitDefaultValue=false)]
        public string Cidade { get; set; }
        /// <summary>
        /// Sigla do estado do portador do cartão.
        /// </summary>
        /// <value>Sigla do estado do portador do cartão.</value>
        [DataMember(Name="estado", EmitDefaultValue=false)]
        public string Estado { get; set; }
        /// <summary>
        /// Nome do pais do portador do cartão.
        /// </summary>
        /// <value>Nome do pais do portador do cartão.</value>
        [DataMember(Name="pais", EmitDefaultValue=false)]
        public string Pais { get; set; }
        /// <summary>
        /// Código de endereçamento postal do portador do cartão.
        /// </summary>
        /// <value>Código de endereçamento postal do portador do cartão.</value>
        [DataMember(Name="codigoPostal", EmitDefaultValue=false)]
        public string CodigoPostal { get; set; }
        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class NovoCartaoPortadorEndereco {\n");
            sb.Append("  Logradouro: ").Append(Logradouro).Append("\n");
            sb.Append("  Complemento: ").Append(Complemento).Append("\n");
            sb.Append("  Cidade: ").Append(Cidade).Append("\n");
            sb.Append("  Estado: ").Append(Estado).Append("\n");
            sb.Append("  Pais: ").Append(Pais).Append("\n");
            sb.Append("  CodigoPostal: ").Append(CodigoPostal).Append("\n");
            sb.Append("}\n");
            return sb.ToString();
        }
  
        /// <summary>
        /// Returns the JSON string presentation of the object
        /// </summary>
        /// <returns>JSON string presentation of the object</returns>
        public string ToJson()
        {
            return JsonConvert.SerializeObject(this, Formatting.Indented);
        }

        /// <summary>
        /// Returns true if objects are equal
        /// </summary>
        /// <param name="obj">Object to be compared</param>
        /// <returns>Boolean</returns>
        public override bool Equals(object obj)
        {
            // credit: http://stackoverflow.com/a/10454552/677735
            return this.Equals(obj as NovoCartaoPortadorEndereco);
        }

        /// <summary>
        /// Returns true if NovoCartaoPortadorEndereco instances are equal
        /// </summary>
        /// <param name="other">Instance of NovoCartaoPortadorEndereco to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(NovoCartaoPortadorEndereco other)
        {
            // credit: http://stackoverflow.com/a/10454552/677735
            if (other == null)
                return false;

            return 
                (
                    this.Logradouro == other.Logradouro ||
                    this.Logradouro != null &&
                    this.Logradouro.Equals(other.Logradouro)
                ) && 
                (
                    this.Complemento == other.Complemento ||
                    this.Complemento != null &&
                    this.Complemento.Equals(other.Complemento)
                ) && 
                (
                    this.Cidade == other.Cidade ||
                    this.Cidade != null &&
                    this.Cidade.Equals(other.Cidade)
                ) && 
                (
                    this.Estado == other.Estado ||
                    this.Estado != null &&
                    this.Estado.Equals(other.Estado)
                ) && 
                (
                    this.Pais == other.Pais ||
                    this.Pais != null &&
                    this.Pais.Equals(other.Pais)
                ) && 
                (
                    this.CodigoPostal == other.CodigoPostal ||
                    this.CodigoPostal != null &&
                    this.CodigoPostal.Equals(other.CodigoPostal)
                );
        }

        /// <summary>
        /// Gets the hash code
        /// </summary>
        /// <returns>Hash code</returns>
        public override int GetHashCode()
        {
            // credit: http://stackoverflow.com/a/263416/677735
            unchecked // Overflow is fine, just wrap
            {
                int hash = 41;
                // Suitable nullity checks etc, of course :)
                if (this.Logradouro != null)
                    hash = hash * 59 + this.Logradouro.GetHashCode();
                if (this.Complemento != null)
                    hash = hash * 59 + this.Complemento.GetHashCode();
                if (this.Cidade != null)
                    hash = hash * 59 + this.Cidade.GetHashCode();
                if (this.Estado != null)
                    hash = hash * 59 + this.Estado.GetHashCode();
                if (this.Pais != null)
                    hash = hash * 59 + this.Pais.GetHashCode();
                if (this.CodigoPostal != null)
                    hash = hash * 59 + this.CodigoPostal.GetHashCode();
                return hash;
            }
        }

        public IEnumerable<ValidationResult> Validate(ValidationContext validationContext)
        { 
            yield break;
        }
    }

}
