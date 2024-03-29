// Code generated by jtd-codegen for C# + System.Text.Json v0.2.1

using System;
using System.Text.Json;
using System.Text.Json.Serialization;

namespace Senzing
{
    [JsonConverter(typeof(SzEngineWhyEntitiesResponseJsonConverter))]
    public class SzEngineWhyEntitiesResponse
    {
        /// <summary>
        /// The underlying data being wrapped.
        /// </summary>
        public WhyEntities Value { get; set; }
    }

    public class SzEngineWhyEntitiesResponseJsonConverter : JsonConverter<SzEngineWhyEntitiesResponse>
    {
        public override SzEngineWhyEntitiesResponse Read(ref Utf8JsonReader reader, Type typeToConvert, JsonSerializerOptions options)
        {
            return new SzEngineWhyEntitiesResponse { Value = JsonSerializer.Deserialize<WhyEntities>(ref reader, options) };
        }

        public override void Write(Utf8JsonWriter writer, SzEngineWhyEntitiesResponse value, JsonSerializerOptions options)
        {
            JsonSerializer.Serialize<WhyEntities>(writer, value.Value, options);
        }
    }
}
