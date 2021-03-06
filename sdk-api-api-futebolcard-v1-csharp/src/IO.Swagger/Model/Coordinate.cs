/* 
 * API do Futebolcard
 *
 * Futebolcard manipulation API
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
    /// Coordinate
    /// </summary>
    [DataContract]
    public partial class Coordinate :  IEquatable<Coordinate>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="Coordinate" /> class.
        /// </summary>
        /// <param name="Id">Id.</param>
        /// <param name="_Coordinate">_Coordinate.</param>
        /// <param name="Shape">Shape.</param>
        public Coordinate(string Id = default(string), string _Coordinate = default(string), string Shape = default(string))
        {
            this.Id = Id;
            this._Coordinate = _Coordinate;
            this.Shape = Shape;
        }
        
        /// <summary>
        /// Gets or Sets Id
        /// </summary>
        [DataMember(Name="id", EmitDefaultValue=false)]
        public string Id { get; set; }
        /// <summary>
        /// Gets or Sets _Coordinate
        /// </summary>
        [DataMember(Name="coordinate", EmitDefaultValue=false)]
        public string _Coordinate { get; set; }
        /// <summary>
        /// Gets or Sets Shape
        /// </summary>
        [DataMember(Name="shape", EmitDefaultValue=false)]
        public string Shape { get; set; }
        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class Coordinate {\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  _Coordinate: ").Append(_Coordinate).Append("\n");
            sb.Append("  Shape: ").Append(Shape).Append("\n");
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
            return this.Equals(obj as Coordinate);
        }

        /// <summary>
        /// Returns true if Coordinate instances are equal
        /// </summary>
        /// <param name="other">Instance of Coordinate to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(Coordinate other)
        {
            // credit: http://stackoverflow.com/a/10454552/677735
            if (other == null)
                return false;

            return 
                (
                    this.Id == other.Id ||
                    this.Id != null &&
                    this.Id.Equals(other.Id)
                ) && 
                (
                    this._Coordinate == other._Coordinate ||
                    this._Coordinate != null &&
                    this._Coordinate.Equals(other._Coordinate)
                ) && 
                (
                    this.Shape == other.Shape ||
                    this.Shape != null &&
                    this.Shape.Equals(other.Shape)
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
                if (this.Id != null)
                    hash = hash * 59 + this.Id.GetHashCode();
                if (this._Coordinate != null)
                    hash = hash * 59 + this._Coordinate.GetHashCode();
                if (this.Shape != null)
                    hash = hash * 59 + this.Shape.GetHashCode();
                return hash;
            }
        }

        public IEnumerable<ValidationResult> Validate(ValidationContext validationContext)
        { 
            yield break;
        }
    }

}
