// Code generated by jtd-codegen for C# + System.Text.Json v0.2.1

using System.Text.Json.Serialization;

namespace Senzing
{
    /// <summary>
    /// No description.
    /// </summary>
    public class CfgEclass
    {
        /// <summary>
        /// No description.
        /// </summary>
        [JsonPropertyName("ECLASS_CODE")]
        public string EclassCode { get; set; }

        /// <summary>
        /// No description.
        /// </summary>
        [JsonPropertyName("ECLASS_DESC")]
        public string EclassDesc { get; set; }

        /// <summary>
        /// No description.
        /// </summary>
        [JsonPropertyName("ECLASS_ID")]
        public int EclassId { get; set; }

        /// <summary>
        /// No description.
        /// </summary>
        [JsonPropertyName("RESOLVE")]
        public string Resolve { get; set; }
    }
}
