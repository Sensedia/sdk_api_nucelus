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
    /// PortadorResponse
    /// </summary>
    [DataContract]
    public partial class PortadorResponse :  IEquatable<PortadorResponse>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="PortadorResponse" /> class.
        /// </summary>
        /// <param name="Portador">Portador.</param>
        public PortadorResponse(Portador Portador = default(Portador))
        {
            this.Portador = Portador;
        }
        
        /// <summary>
        /// Gets or Sets Portador
        /// </summary>
        [DataMember(Name="portador", EmitDefaultValue=false)]
        public Portador Portador { get; set; }
        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class PortadorResponse {\n");
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
            return this.Equals(obj as PortadorResponse);
        }

        /// <summary>
        /// Returns true if PortadorResponse instances are equal
        /// </summary>
        /// <param name="other">Instance of PortadorResponse to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(PortadorResponse other)
        {
            // credit: http://stackoverflow.com/a/10454552/677735
            if (other == null)
                return false;

            return 
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
