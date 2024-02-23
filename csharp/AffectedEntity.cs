// Code generated by jtd-codegen for C# + System.Text.Json v0.2.1

using System.Text.Json.Serialization;

namespace Senzing
{
    public class AffectedEntity
    {
        /// <summary>
        /// The ENTITY_ID is the Senzing-generated identifier for the discovered
        /// entity. It may change when new information is added.
        /// </summary>
        [JsonPropertyName("ENTITY_ID")]
        public int EntityId { get; set; }
    }
}
