// Code generated by jtd-codegen for C# + System.Text.Json v0.2.1

using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Senzing
{
    /// <summary>
    /// No description.
    /// </summary>
    public class DiagnosticGetFeatureResponse
    {
        /// <summary>
        /// No description.
        /// </summary>
        [JsonPropertyName("ELEMENTS")]
        public IList<DiagnosticGetFeatureResponseElements> Elements { get; set; }

        /// <summary>
        /// No description.
        /// </summary>
        [JsonPropertyName("FTYPE_CODE")]
        public string FtypeCode { get; set; }

        /// <summary>
        /// No description.
        /// </summary>
        [JsonPropertyName("LIB_FEAT_ID")]
        public int LibFeatId { get; set; }
    }
}
