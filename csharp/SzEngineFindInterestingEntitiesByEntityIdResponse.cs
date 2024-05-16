// Code generated by jtd-codegen for C# + System.Text.Json v0.2.1

using System;
using System.Text.Json;
using System.Text.Json.Serialization;

namespace Senzing
{
    [JsonConverter(typeof(SzEngineFindInterestingEntitiesByEntityIdResponseJsonConverter))]
    public class SzEngineFindInterestingEntitiesByEntityIdResponse
    {
        /// <summary>
        /// The underlying data being wrapped.
        /// </summary>
        public Interesting Value { get; set; }
    }

    public class SzEngineFindInterestingEntitiesByEntityIdResponseJsonConverter : JsonConverter<SzEngineFindInterestingEntitiesByEntityIdResponse>
    {
        public override SzEngineFindInterestingEntitiesByEntityIdResponse Read(ref Utf8JsonReader reader, Type typeToConvert, JsonSerializerOptions options)
        {
            return new SzEngineFindInterestingEntitiesByEntityIdResponse { Value = JsonSerializer.Deserialize<Interesting>(ref reader, options) };
        }

        public override void Write(Utf8JsonWriter writer, SzEngineFindInterestingEntitiesByEntityIdResponse value, JsonSerializerOptions options)
        {
            JsonSerializer.Serialize<Interesting>(writer, value.Value, options);
        }
    }
}