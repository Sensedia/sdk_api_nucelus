/* 
 * API dos Correios
 *
 * API de rastreios de Objetos Postais
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
    /// Customer Model
    /// </summary>
    [DataContract]
    public partial class FaixaCEP :  IEquatable<FaixaCEP>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="FaixaCEP" /> class.
        /// </summary>
        /// <param name="Nome">Nome do municipio.</param>
        /// <param name="Inicio">inicio da faixa de CEP.</param>
        /// <param name="Fim">Fim da faixa de CEP.</param>
        public FaixaCEP(string Nome = default(string), string Inicio = default(string), string Fim = default(string))
        {
            this.Nome = Nome;
            this.Inicio = Inicio;
            this.Fim = Fim;
        }
        
        /// <summary>
        /// Nome do municipio
        /// </summary>
        /// <value>Nome do municipio</value>
        [DataMember(Name="nome", EmitDefaultValue=false)]
        public string Nome { get; set; }
        /// <summary>
        /// inicio da faixa de CEP
        /// </summary>
        /// <value>inicio da faixa de CEP</value>
        [DataMember(Name="inicio", EmitDefaultValue=false)]
        public string Inicio { get; set; }
        /// <summary>
        /// Fim da faixa de CEP
        /// </summary>
        /// <value>Fim da faixa de CEP</value>
        [DataMember(Name="fim", EmitDefaultValue=false)]
        public string Fim { get; set; }
        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class FaixaCEP {\n");
            sb.Append("  Nome: ").Append(Nome).Append("\n");
            sb.Append("  Inicio: ").Append(Inicio).Append("\n");
            sb.Append("  Fim: ").Append(Fim).Append("\n");
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
            return this.Equals(obj as FaixaCEP);
        }

        /// <summary>
        /// Returns true if FaixaCEP instances are equal
        /// </summary>
        /// <param name="other">Instance of FaixaCEP to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(FaixaCEP other)
        {
            // credit: http://stackoverflow.com/a/10454552/677735
            if (other == null)
                return false;

            return 
                (
                    this.Nome == other.Nome ||
                    this.Nome != null &&
                    this.Nome.Equals(other.Nome)
                ) && 
                (
                    this.Inicio == other.Inicio ||
                    this.Inicio != null &&
                    this.Inicio.Equals(other.Inicio)
                ) && 
                (
                    this.Fim == other.Fim ||
                    this.Fim != null &&
                    this.Fim.Equals(other.Fim)
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
                if (this.Nome != null)
                    hash = hash * 59 + this.Nome.GetHashCode();
                if (this.Inicio != null)
                    hash = hash * 59 + this.Inicio.GetHashCode();
                if (this.Fim != null)
                    hash = hash * 59 + this.Fim.GetHashCode();
                return hash;
            }
        }

        public IEnumerable<ValidationResult> Validate(ValidationContext validationContext)
        { 
            yield break;
        }
    }

}