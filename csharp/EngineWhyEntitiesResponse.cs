// Code generated by jtd-codegen for C# + System.Text.Json v0.2.1

using System;
using System.Text.Json;
using System.Text.Json.Serialization;

namespace Senzing
{
    /// <summary>
    /// No description.
    /// </summary>
    [JsonConverter(typeof(EngineWhyEntitiesResponseJsonConverter))]
    public class EngineWhyEntitiesResponse
    {
        /// <summary>
        /// The underlying data being wrapped.
        /// </summary>
        public WhyEntities Value { get; set; }
    }

    public class EngineWhyEntitiesResponseJsonConverter : JsonConverter<EngineWhyEntitiesResponse>
    {
        public override EngineWhyEntitiesResponse Read(ref Utf8JsonReader reader, Type typeToConvert, JsonSerializerOptions options)
        {
            return new EngineWhyEntitiesResponse { Value = JsonSerializer.Deserialize<WhyEntities>(ref reader, options) };
        }

        public override void Write(Utf8JsonWriter writer, EngineWhyEntitiesResponse value, JsonSerializerOptions options)
        {
            JsonSerializer.Serialize<WhyEntities>(writer, value.Value, options);
        }
    }
}
