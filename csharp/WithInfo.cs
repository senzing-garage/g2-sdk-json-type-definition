// Code generated by jtd-codegen for C# + System.Text.Json v0.2.1

using System.Text.Json.Serialization;

namespace Senzing
{
    /// <summary>
    /// No description.
    /// </summary>
    public class WithInfo
    {
        /// <summary>
        /// No description.
        /// </summary>
        [JsonPropertyName("AFFECTED_ENTITIES")]
        public AffectedEntities AffectedEntities { get; set; }

        /// <summary>
        /// No description.
        /// </summary>
        [JsonPropertyName("DATA_SOURCE")]
        public string DataSource { get; set; }

        /// <summary>
        /// No description.
        /// </summary>
        [JsonPropertyName("INTERESTING_ENTITIES")]
        public InterestingEntities InterestingEntities { get; set; }

        /// <summary>
        /// No description.
        /// </summary>
        [JsonPropertyName("RECORD_ID")]
        public string RecordId { get; set; }
    }
}
