// Code generated by jtd-codegen for C# + System.Text.Json v0.2.1

using System.Text.Json.Serialization;

namespace Senzing
{
    /// <summary>
    /// No description.
    /// </summary>
    public class CfgFelem
    {
        /// <summary>
        /// No description.
        /// </summary>
        [JsonPropertyName("DATA_TYPE")]
        public string DataType { get; set; }

        /// <summary>
        /// No description.
        /// </summary>
        [JsonPropertyName("FELEM_CODE")]
        public string FelemCode { get; set; }

        /// <summary>
        /// No description.
        /// </summary>
        [JsonPropertyName("FELEM_DESC")]
        public string FelemDesc { get; set; }

        /// <summary>
        /// No description.
        /// </summary>
        [JsonPropertyName("FELEM_ID")]
        public int FelemId { get; set; }

        /// <summary>
        /// No description.
        /// </summary>
        [JsonPropertyName("TOKENIZE")]
        public string Tokenize { get; set; }
    }
}
