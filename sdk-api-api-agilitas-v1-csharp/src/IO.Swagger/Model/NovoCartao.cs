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
    /// NovoCartao
    /// </summary>
    [DataContract]
    public partial class NovoCartao :  IEquatable<NovoCartao>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="NovoCartao" /> class.
        /// </summary>
        /// <param name="IdCartao">Número identificador referente ao proxy do cartão..</param>
        /// <param name="Valor">Valor monetário a ser creditado na conta do cartão..</param>
        /// <param name="Contrasenha">Senha informada ao se requisitar o do cartão.</param>
        /// <param name="Portador">Portador.</param>
        public NovoCartao(string IdCartao = default(string), double? Valor = default(double?), string Contrasenha = default(string), NovoCartaoPortador Portador = default(NovoCartaoPortador))
        {
            this.IdCartao = IdCartao;
            this.Valor = Valor;
            this.Contrasenha = Contrasenha;
            this.Portador = Portador;
        }
        
        /// <summary>
        /// Número identificador referente ao proxy do cartão.
        /// </summary>
        /// <value>Número identificador referente ao proxy do cartão.</value>
        [DataMember(Name="idCartao", EmitDefaultValue=false)]
        public string IdCartao { get; set; }
        /// <summary>
        /// Valor monetário a ser creditado na conta do cartão.
        /// </summary>
        /// <value>Valor monetário a ser creditado na conta do cartão.</value>
        [DataMember(Name="valor", EmitDefaultValue=false)]
        public double? Valor { get; set; }
        /// <summary>
        /// Senha informada ao se requisitar o do cartão
        /// </summary>
        /// <value>Senha informada ao se requisitar o do cartão</value>
        [DataMember(Name="contrasenha", EmitDefaultValue=false)]
        public string Contrasenha { get; set; }
        /// <summary>
        /// Gets or Sets Portador
        /// </summary>
        [DataMember(Name="portador", EmitDefaultValue=false)]
        public NovoCartaoPortador Portador { get; set; }
        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class NovoCartao {\n");
            sb.Append("  IdCartao: ").Append(IdCartao).Append("\n");
            sb.Append("  Valor: ").Append(Valor).Append("\n");
            sb.Append("  Contrasenha: ").Append(Contrasenha).Append("\n");
            sb.Append("  Portador: ").Append(Portador).Append("\n");
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
            return this.Equals(obj as NovoCartao);
        }

        /// <summary>
        /// Returns true if NovoCartao instances are equal
        /// </summary>
        /// <param name="other">Instance of NovoCartao to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(NovoCartao other)
        {
            // credit: http://stackoverflow.com/a/10454552/677735
            if (other == null)
                return false;

            return 
                (
                    this.IdCartao == other.IdCartao ||
                    this.IdCartao != null &&
                    this.IdCartao.Equals(other.IdCartao)
                ) && 
                (
                    this.Valor == other.Valor ||
                    this.Valor != null &&
                    this.Valor.Equals(other.Valor)
                ) && 
                (
                    this.Contrasenha == other.Contrasenha ||
                    this.Contrasenha != null &&
                    this.Contrasenha.Equals(other.Contrasenha)
                ) && 
                (
                    this.Portador == other.Portador ||
                    this.Portador != null &&
                    this.Portador.Equals(other.Portador)
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
                if (this.IdCartao != null)
                    hash = hash * 59 + this.IdCartao.GetHashCode();
                if (this.Valor != null)
                    hash = hash * 59 + this.Valor.GetHashCode();
                if (this.Contrasenha != null)
                    hash = hash * 59 + this.Contrasenha.GetHashCode();
                if (this.Portador != null)
                    hash = hash * 59 + this.Portador.GetHashCode();
                return hash;
            }
        }

        public IEnumerable<ValidationResult> Validate(ValidationContext validationContext)
        { 
            yield break;
        }
    }

}
