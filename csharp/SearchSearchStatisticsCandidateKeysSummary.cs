// Code generated by jtd-codegen for C# + System.Text.Json v0.2.1

using System.Text.Json.Serialization;

namespace Senzing
{
    /// <summary>
    /// No description.
    /// </summary>
    public class SearchSearchStatisticsCandidateKeysSummary
    {
        /// <summary>
        /// No description.
        /// </summary>
        [JsonPropertyName("FOUND")]
        public int Found { get; set; }

        /// <summary>
        /// No description.
        /// </summary>
        [JsonPropertyName("GENERIC")]
        public int Generic { get; set; }

        /// <summary>
        /// No description.
        /// </summary>
        [JsonPropertyName("NOT_FOUND")]
        public int NotFound { get; set; }
    }
}